package com.example.VoiceReview;

import org.apache.juli.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    LoginService loginService=new LoginService();
    @RequestMapping
    public String start(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
    @PostMapping
    public String login(@ModelAttribute User user, Model model){
        model.addAttribute("user",user);
        if(loginService.tryLogin(user)){
            return "result";
        }
        else {
            return "login";
        }
    }
}
