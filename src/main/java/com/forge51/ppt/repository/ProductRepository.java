package com.forge51.ppt.repository;

import com.forge51.ppt.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final Map<String, Product> products;

    public Optional<Product> get( String id )
    {
        if ( products.containsKey(id)) {
            return Optional.of( products.get(id) );
        }

        return Optional.empty();
    }

    public Collection<Product> findAll()
    {
        return products.values();
    }

    public void save( Product product )
    {
        products.put(product.productId(), product );
    }


}
