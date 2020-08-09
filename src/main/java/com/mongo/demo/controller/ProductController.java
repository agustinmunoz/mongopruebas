package com.mongo.demo.controller;

import com.mongo.demo.dto.Product;
import com.mongo.demo.dto.Product2;
import com.mongo.demo.repository.Product2Repository;
import com.mongo.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductRepository productRepository;

    @Autowired
    public Product2Repository product2Repository;

    @GetMapping("/products")
    public List<Product> getProducts() {

        return productRepository.findAll();
    }

    @GetMapping ("/products2")
    public String addProducts() {

        Product2 product2=new Product2();
        product2.setId(2);
        product2.setName("Ramón");
        product2.setApe1("Rodriguez");
        product2Repository.save(product2);
        return ("Grabado" + product2.getName());
    }

}
