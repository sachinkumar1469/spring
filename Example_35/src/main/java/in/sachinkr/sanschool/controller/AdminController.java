package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Courses;
import in.sachinkr.sanschool.model.Person;
import in.sachinkr.sanschool.model.SanClass;
import in.sachinkr.sanschool.repository.CoursesRepository;
import in.sachinkr.sanschool.repository.PersonRepository;
import in.sachinkr.sanschool.repository.SanClassRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.w3c.dom.stylesheets.LinkStyle;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private SanClassRepository sanClassRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @RequestMapping("/displayClasses")
    public ModelAndView displayClass(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("classes.html");
        modelAndView.addObject("sanClass",new SanClass());
        modelAndView.addObject("sanClasses",sanClassRepository.findAll());
        return modelAndView;
    }

    @RequestMapping(value = "/addNewClass",method = {RequestMethod.POST})
    public String addNewClass(@Valid @ModelAttribute SanClass sanClass, Errors errors){
        if(errors.hasErrors()){
            return "redirect:/admin/displayClasses";
        }
        sanClassRepository.save(sanClass);
        return "redirect:/admin/displayClasses";
    }


    @RequestMapping("/displayStudents")
    public ModelAndView displayStudentOfClass(@RequestParam(value = "classId") int classId,
                                              @RequestParam(value = "error",required = false) boolean error,
                                              HttpSession httpSession){
        String errorMessage = null;
        Optional<SanClass> sanClass = sanClassRepository.findById(classId);
        ModelAndView modelAndView = new ModelAndView();
        if(sanClass.isPresent()){
            modelAndView.addObject("sanClass",sanClass.get());
            httpSession.setAttribute("sessionClass",sanClass.get());
        }
        modelAndView.addObject("person",new Person());
        if(error){
            errorMessage = "Invalid email address";
            modelAndView.addObject("errorMessage",errorMessage);
        }
        modelAndView.setViewName("students.html");
        return modelAndView;
    }

    @RequestMapping("/addStudent")
    public ModelAndView addNewStudent(@RequestParam String email, HttpSession httpSession, HttpServletRequest httpRequest) {
        SanClass sanClass = (SanClass) httpSession.getAttribute("sessionClass");
        ModelAndView modelAndView = new ModelAndView();

        if (sanClass != null && sanClass.getClassId() > 0) {
            Person person = personRepository.findByEmail(email);
            if (person != null) {
                person.setSanClass(sanClass);
                personRepository.save(person);
                modelAndView.setViewName("redirect:/admin/displayStudents?classId=" + sanClass.getClassId());
            } else {
                modelAndView.setViewName("redirect:/admin/displayStudents?classId=" + sanClass.getClassId() + "&error=true");
            }
        } else {
            modelAndView.setViewName("redirect:/home");
        }
        return modelAndView;
    }

    @RequestMapping("deleteClass")
    public ModelAndView deleteClass(@RequestParam(value = "id") int classId){
        Optional<SanClass> sanClass = sanClassRepository.findById(classId);
        if(sanClass.isPresent()){
            SanClass sanClass1 = sanClass.get();
            List<Person> list = sanClass1.getPersons();
            for(Person person : list){
                person.setSanClass(null);
                personRepository.save(person);
            }
            sanClassRepository.delete(sanClass1);
        }

        ModelAndView modelAndView = new ModelAndView("redirect:/admin/displayClasses");
        return modelAndView;
    }

    @RequestMapping("/deleteStudent")
    public RedirectView deleteStudent(@RequestParam(value = "personId") int personId, HttpServletRequest httpServletRequest){
        String referer = httpServletRequest.getHeader("referer");
        RedirectView redirectView = new RedirectView();
        Optional<Person> person =  personRepository.findById(personId);
        if(person.isPresent()){
            person.get().setSanClass(null);
            personRepository.save(person.get());
        }
        if(referer != null && !referer.isEmpty()){
            redirectView.setUrl(referer);
        } else {
            redirectView.setUrl("/home");
        }
        return redirectView;
    }
    @RequestMapping("/displayCourses")
    public ModelAndView displayCourses(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courses_secure.html");
        List<Courses> list = coursesRepository.findAll();
        modelAndView.addObject("courses",list);
        modelAndView.addObject("course",new Courses());
        return modelAndView;
    }

    @RequestMapping(value = "/addNewCourse",method = {RequestMethod.POST})
    public RedirectView addNewCourse(@ModelAttribute Courses course,HttpServletRequest httpServletRequest){
        System.out.println("Here in post mapping /addnewcourse");
        Courses newCourse = coursesRepository.save(course);
        String referer = httpServletRequest.getHeader("referer");
//        System.out.println(referer);
        RedirectView redirectView = new RedirectView();

        redirectView.setUrl(referer);
        return redirectView;
    }

    @RequestMapping("/viewStudents")
    public ModelAndView displayCourseDetail(@RequestParam(value = "id") int courseId,
                                            HttpSession httpSession,
                                            @RequestParam(value = "error",required = false) boolean error){
        Optional<Courses> course = coursesRepository.findById(courseId);
        Courses courses = null;
        ModelAndView modelAndView = new ModelAndView();
        String errorMessage = null;
        if(error){
            errorMessage = "Invalid email address";
            modelAndView.addObject("errorMessage",errorMessage);
        }
        if(course.isPresent()){
            courses = course.get();
        } else {
            modelAndView.setViewName("redirect:/admin/displayCourses");
            return modelAndView;
        }
        httpSession.setAttribute("sessionCourse",courses);
        modelAndView.setViewName("course_students.html");
        modelAndView.addObject("person",new Person());
        modelAndView.addObject("courses",courses);
        return modelAndView;
    }

    @PostMapping("/addStudentToCourse")
    public ModelAndView addStudentToCoures(@ModelAttribute Person person,HttpSession httpSession){
        String email = person.getEmail();
        ModelAndView modelAndView = new ModelAndView();
        Person person1 = personRepository.findByEmail(email);
        Courses sessionCourse = (Courses) httpSession.getAttribute("sessionCourse");
        if(person1 != null && person1.getPersonId()>0){
            person1.getCourses().add(sessionCourse);
            sessionCourse.getPersons().add(person1);
            personRepository.save(person1);
            httpSession.setAttribute("sessionCourse",sessionCourse);
            modelAndView.setViewName("redirect:/admin/viewStudents?id="+sessionCourse.getCourseId());
        } else {
            modelAndView.setViewName("redirect:/admin/viewStudents?id="+sessionCourse.getCourseId()+"" +
                    "&error=true");
        }
        return modelAndView;
    }

    @RequestMapping("/deleteStudentFromCourse")
    public ModelAndView deleteStudent(@RequestParam int personId,HttpSession httpSession){
        Courses sessionCourse  = (Courses) httpSession.getAttribute("sessionCourse");
        ModelAndView modelAndView = new ModelAndView();
        Person person = personRepository.findById(personId).get();
        if(person != null && person.getPersonId()>0){
            System.out.println("Person is: "+person.toString());
            System.out.println("Length of courses in person is: "+person.getCourses().size());
            person.getCourses().remove(sessionCourse);
            System.out.println("Length of courses in person after removing is: "+person.getCourses().size());
            sessionCourse.getPersons().remove(person);
            personRepository.save(person);
            httpSession.setAttribute("sessionCourse",sessionCourse);
        }
        modelAndView.setViewName("redirect:/admin/viewStudents?id="+sessionCourse.getCourseId());
        return modelAndView;
    }
}
