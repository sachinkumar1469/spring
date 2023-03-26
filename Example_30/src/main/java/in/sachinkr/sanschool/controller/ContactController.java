package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.service.ContactService;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public  ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @RequestMapping("/contact")
    public String getContact(Model model){
        model.addAttribute("contact",new Contact());
        return "contact.html";
    }

//    @RequestMapping(value = "/saveMsg",method = POST)
//    public ModelAndView getMsg(@RequestParam String name,@RequestParam String mobileNum,
//                                @RequestParam String email, @RequestParam String subject, @RequestParam String message ){
//
//        System.out.println("Name is "+name);
//        System.out.println("mobileNum is "+mobileNum);
//        System.out.println("email is "+email);
//        System.out.println("subject is "+subject);
//        System.out.println("msg is "+message);
//
//        return new ModelAndView("redirect:/contact");
//    }

    @RequestMapping(value = "/saveMsg", method = POST)
    public String handleContactForm(@Valid @ModelAttribute(name = "contact") Contact contact, Errors errors){
        if(errors.hasErrors()){
            System.out.println("Error exist");
            return "contact.html";
        }
        System.out.println("Before save msg call");
        this.contactService.saveContact(contact);
        return "redirect:/contact";
    }

    @RequestMapping("/displayMessages")
    public ModelAndView displayMsg(){
        System.out.println("here in display Msg");
        List<Contact> msgList = contactService.findMsgWithOpenStatus();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("messages.html");
        modelAndView.addObject("contactMsgs",msgList);
        return modelAndView;
    }

    @RequestMapping("/closeMsg")
    public String changeStatus(@RequestParam int id, Authentication authentication){
        System.out.println("Id is: "+id);
        System.out.println("In close msg");

        contactService.changeStatusById(id, SanSchoolConstants.CLOSE,authentication.getName());
        return "redirect:/displayMessages";
    }
}
