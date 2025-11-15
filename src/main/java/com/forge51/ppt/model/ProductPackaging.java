package com.forge51.ppt.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Reference;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class ProductPackaging {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    UUID productPackingId;

    @ManyToOne
    @JoinColumn( name="productId")
    Product product;

    @OneToMany
    List<Packaging> packaging;
}
