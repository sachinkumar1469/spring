package in.sachinkr.sanschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homeController(Model model){
        model.addAttribute("dynamic","Hello Sachin Yadav How are you");
        model.addAttribute("name","Sachin");
        model.addAttribute("nnamer","Sachin");
        return "home.html";
    }
}
