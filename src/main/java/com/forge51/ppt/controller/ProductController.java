package com.forge51.ppt.controller;

import com.forge51.ppt.model.Product;
import com.forge51.ppt.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public Collection<Product> products()
    {
        return productService.findAll();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById( @PathVariable String productId )
    {
        return  productService.findById( UUID.fromString(productId) )
                .orElse(null);
    }
}
