package com.mySite.appli1.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product")
public class ProductController {
    
    @GetMapping
    public String getProduct(@RequestParam int id, Model model) {
	model.addAttribute("id", id * 2);
	return "product";
    }

    @GetMapping("/add")
    public String addProduct(@Valid @ModelAttribute("product") com.mySite.appli1.model.Product product,
	    BindingResult result, Model model) {
	if (result.hasErrors()) {
	    System.out.println("Product is not valid...");
	    return "product";
	}
	return "redirect:/products";
    }

}
