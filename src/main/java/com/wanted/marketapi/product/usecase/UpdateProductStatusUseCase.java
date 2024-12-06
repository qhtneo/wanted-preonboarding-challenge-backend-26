package com.wanted.marketapi.product.usecase;


import com.wanted.marketapi.product.domain.ProductStatus;

public interface UpdateProductStatusUseCase {
    boolean updateProductStatus(Long productId, ProductStatus status);
}
