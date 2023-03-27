package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Person;
import in.sachinkr.sanschool.service.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("public")
public class PublicController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/register",method = {RequestMethod.GET})
    public String registerController(Model model){
        model.addAttribute("person",new Person());
        return "register.html";
    }


    @RequestMapping(value = "/createUser",method = {RequestMethod.POST})
    public String registerUser(@Valid @ModelAttribute Person person,Errors errors){
        if(errors.hasErrors()){
            System.out.println("Person signup form has error");
            System.out.println(">>>>>>>>>>>>>>>>>"+errors.getAllErrors());
            return "register.html";
        }
        boolean isSaved = personService.createNewPerson(person);
        if(isSaved){
            return "redirect:/login?register=true";
        } else {
            return "register.html";
        }
    }
}
