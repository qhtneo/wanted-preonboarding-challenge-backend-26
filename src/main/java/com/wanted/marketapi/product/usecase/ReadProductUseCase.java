package com.wanted.marketapi.product.usecase;

import com.wanted.marketapi.product.domain.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReadProductUseCase {
    Product findById(Long id);

    List<Product> findAll(Pageable pageable);

}
