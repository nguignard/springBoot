package com.mySite.appli1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Secured("ROLE_ADMIN")
public class HomeController {

    @GetMapping({ "/home", "/", "/user" })
    public String home() {
	return "home";
    }
    
//    
//    @GetMapping("/home")
//    public String homeLogged(@ModelAttribute(user), Model model) {
//	model.addAttribute("user", username);
//	return "home";
//    }
}
