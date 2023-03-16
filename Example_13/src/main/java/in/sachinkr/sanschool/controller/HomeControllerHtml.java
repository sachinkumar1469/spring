package in.sachinkr.sanschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerHtml {
    @RequestMapping("/home")
    public String getHome(){
        return "home.html";
    }
}
