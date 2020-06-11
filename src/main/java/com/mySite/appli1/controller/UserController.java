package com.mySite.appli1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mySite.appli1.dao.UserRepository;
import com.mySite.appli1.model.User;
import com.mySite.appli1.validator.UserValidator;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepo;
    
    @GetMapping
    public String home() {
	return "home";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
	model.addAttribute("user", new User(null, null));
	return "user/add";
    }

    @PostMapping("/add")
    public String addUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
	new UserValidator().validate(user, result);
	if (result.hasErrors()) {
	    System.out.println("Product is not valid...");
	    return "user/add";
	}
	userRepo.save(user);
	return "redirect:user/login";
    }

    @GetMapping("/login")
    public String enterLogin() {
	return "user/login";
    }

    @PostMapping("/login")
    public String logUser(Model model) {
	model.addAttribute("", "login");
	model.addAttribute("passWordConfirmd", "password");

	return "redirect:products";
    }

//
//    @PostMapping("/login")
//    public String loggUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
//	new UserValidator().validate(user, result);
//	if (result.hasErrors()) {
//	    System.out.println("Product is not valid...");
//	    return "user/login";
//	}
//
//	return "redirect:products";
//    }

}
