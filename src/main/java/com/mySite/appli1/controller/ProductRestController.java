package com.mySite.appli1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mySite.appli1.dao.ProductRepository;
import com.mySite.appli1.model.Product;

@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductRestController {

    @Autowired
    private ProductRepository daoProduct;

//    @GetMapping("")
//    public List<Product> findAll() {
//	return this.daoProduct.findAll();
//    }

    @GetMapping("/id")
    public Product findById() {
	Product product = new Product();
	product.setName("monProduit");
	return product;
    }

@PostMapping("/add")
public Product add(@RequestBody Product product) {
    this.daoProduct.save(product);
    return product;
}

}