package com.wanted.marketapi.product.usecase;

import com.wanted.marketapi.product.domain.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ReadProductUseCase {
    Product findById(UUID id);

    List<Product> findAll(Pageable pageable);

}
