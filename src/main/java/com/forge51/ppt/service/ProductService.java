package com.forge51.ppt.service;

import com.forge51.ppt.model.IndustryClassification;
import com.forge51.ppt.model.Product;
import com.forge51.ppt.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.NumberUtils;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService( ProductRepository productRepository )
    {
        this.productRepository = productRepository;

        loadDummyData();
    }

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

    private void loadDummyData()
    {
        productRepository.deleteAll();

        addProduct(1L, IndustryClassification.RETAIL );
        addProduct(2L, IndustryClassification.MANUFACTURER );
        addProduct(3L, IndustryClassification.FOOD_SERVICE );
    }

    private void addProduct( Long l, IndustryClassification industryClassification)
    {
        Product product = new Product();

        product.setName( String.format("%s %s", "Product", l));
        product.setStockLanded(l);
        product.setStockInStore(l);
        product.setIndustryClassification( industryClassification );

        productRepository.save(product);
    }
}
