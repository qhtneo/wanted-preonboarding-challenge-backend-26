package com.wanted.marketapi.product.usecase;


import com.wanted.marketapi.product.domain.ProductStatus;

import java.util.UUID;

public interface UpdateProductStatusUseCase {
    boolean updateProductStatus(UUID productId, ProductStatus status);
}
