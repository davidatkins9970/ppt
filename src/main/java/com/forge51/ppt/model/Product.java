package com.forge51.ppt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private UUID productId;

    private String name;

    private long stockLanded;

    private long stockInStore;

    private IndustryClassification industryClassification;
}
