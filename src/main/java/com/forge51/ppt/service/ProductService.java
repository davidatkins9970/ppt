package com.forge51.ppt.service;

import com.forge51.ppt.model.Product;
import com.forge51.ppt.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Collection<Product> findAll()
    {
        return productRepository.findAll();
    }

    public Optional<Product> findById( UUID productId )
    {
        return productRepository.findById(productId);
    }

    public void save( Product product )
    {
        productRepository.save(product);
    }
}
