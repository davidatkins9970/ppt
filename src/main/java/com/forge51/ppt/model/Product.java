package com.forge51.ppt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    private UUID productId;

    private String name;

    private Long stockLanded;

    private Long stockInStore;

    private IndustryClassification industryClassification;
}
