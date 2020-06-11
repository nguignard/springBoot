package com.mySite.appli1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/products")
public class ProductsController {
    
    @GetMapping("/products")
    public String getProducts(Model model) {
	// model.addAttribute(new Product("myProduct", 10.0));
	return "home";
    }

//    @GetMapping("/add")
//    public String addProduct(Model model) {
//	System.out.println("GAGDOGUDU");
//	model.addAttribute("product", new Product("rabot", 10.0));
//	return "product";
//    }
//
//
//    @PostMapping("/add")
//    public String processAddProduct(@ModelAttribute("product") Product product, Model model) {
//
//	System.out.println("addController");
////	System.out.println("Name : " + product.getName() + " Price : " + product.getPrice());
//	// ...
//	return "redirect:/products";
//    }

}
