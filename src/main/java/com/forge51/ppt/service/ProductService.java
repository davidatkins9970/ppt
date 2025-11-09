package com.forge51.ppt.service;

import com.forge51.ppt.model.Product;
import com.forge51.ppt.repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Collection<Product> findAll()
    {
        return productRepository.findAll();
    }

    public Optional<Product> get(String id )
    {
        return productRepository.get(id);
    }

    public void save( Product product )
    {
        productRepository.save(product);
    }
}
