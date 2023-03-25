package in.sachinkr.sanschool.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String getLogin(@RequestParam(value = "logout",required = false) String logout,
                           @RequestParam(value = "error",required = false) String error,
                           Model model){

        String errorMessage = null;

        if(error != null){
            errorMessage = "Inavalid credentialis!";
        }

        if(logout != null){
            errorMessage = "You've been succesfully logged out!";
        }

        model.addAttribute("errorMessage",errorMessage);
        System.out.println("Logout: "+logout);
        System.out.println("Error: "+error);
        return "login.html";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout=true";
    }
}
