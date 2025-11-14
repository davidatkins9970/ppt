package com.forge51.ppt.repository;

import com.forge51.ppt.model.ProductPackaging;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductPackagingRepository extends JpaRepository<ProductPackaging, UUID> {
}
