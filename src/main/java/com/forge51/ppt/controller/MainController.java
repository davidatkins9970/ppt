package com.forge51.ppt.controller;

import com.forge51.ppt.model.Product;
import com.forge51.ppt.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
@Slf4j
public class MainController {

    private final ProductService productService;

    public MainController( ProductService productService )
    {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index() {

        Collection<Product> products = productService.findAll();

        products.forEach(product -> log.info( "{}", product ) );

        return "forward:/index.html";
    }
}
