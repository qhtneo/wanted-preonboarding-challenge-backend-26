package com.wanted.marketapi.product.usecase;


import com.wanted.marketapi.product.domain.Product;

public interface SaveProductUseCase {
    Product saveProduct(Product product);
}
