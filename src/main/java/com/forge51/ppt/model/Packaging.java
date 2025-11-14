package com.forge51.ppt.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class Packaging
{
        @Id
        @GeneratedValue(strategy = IDENTITY)
        private UUID packagingId;

        private PackagingType type;

        double weight;
}
