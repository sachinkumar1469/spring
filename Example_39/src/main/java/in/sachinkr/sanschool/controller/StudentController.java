package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Person;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping("/displayCourses")
    public ModelAndView displayCourses(HttpSession httpSession){
        Person person = (Person) httpSession.getAttribute("person");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courses_enrolled.html");
        modelAndView.addObject("person",person);
//        System.out.println("Person object is+ "+person.toString());
        return modelAndView;
    }
}
