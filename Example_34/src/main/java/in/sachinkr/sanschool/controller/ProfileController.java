package in.sachinkr.sanschool.controller;

import in.sachinkr.sanschool.model.Address;
import in.sachinkr.sanschool.model.Person;
import in.sachinkr.sanschool.model.Profile;
import in.sachinkr.sanschool.repository.AddressRepository;
import in.sachinkr.sanschool.repository.PersonRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/displayProfile",method = {RequestMethod.GET})
    public String showProfile(Model model, HttpSession httpSession){
        Profile profile = new Profile();
        profile.setName("Sachin Yadav");
        Person person = (Person) httpSession.getAttribute("person");
        profile.setName(person.getName());
        profile.setEmail(person.getEmail());
        profile.setMobileNumber(person.getMobileNumber());
        Address pAddress = person.getAddress();
        System.out.println("Address of person in display profile is: "+pAddress.toString());
        if(pAddress != null && pAddress.getAddressId()>0){
            profile.setAddress1(pAddress.getAddress1());
            profile.setAddress2(pAddress.getAddress2());
            profile.setCity(pAddress.getCity());
            profile.setState(pAddress.getState());
            profile.setZipCode(pAddress.getZipCode());
        }
        model.addAttribute("profile",profile);
        return "profile.html";
    }

    @RequestMapping(value = "/updateProfile",method = {RequestMethod.POST})
    public String updateProfile(@Valid @ModelAttribute Profile profile, Errors errors,HttpSession httpSession){
        if(errors.hasErrors()){
            return "redirect:/displayProfile";
        }
        Person person = (Person) httpSession.getAttribute("person");
        person.setName(profile.getName());
        person.setEmail(profile.getEmail());
        person.setMobileNumber(profile.getMobileNumber());
        Address address = person.getAddress();
        if(address == null){
            address = new Address();
        }
        address.setState(profile.getState());
        address.setCity(profile.getCity());
        address.setZipCode(profile.getZipCode());
        address.setAddress1(profile.getAddress1());
        address.setAddress2(profile.getAddress2());
        person.setAddress(address);
        person = personRepository.save(person);
        httpSession.setAttribute("person",person);
        System.out.println(">>>>>>>>>>>>> profile: "+profile.toString());
        return "redirect:/displayProfile";
    }
}
