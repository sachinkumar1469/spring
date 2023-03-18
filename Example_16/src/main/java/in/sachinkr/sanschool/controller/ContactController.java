package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Contact;
import in.sachinkr.sanschool.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public  ContactController(ContactService contactService){
        this.contactService = contactService;
    }
    @RequestMapping("/contact")
    public String getContact(){
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
    public ModelAndView handleContactForm(Contact contact){
//        System.out.println(contact);
        this.contactService.saveContact(contact);
        return new ModelAndView("redirect:/contact");
    }
}
