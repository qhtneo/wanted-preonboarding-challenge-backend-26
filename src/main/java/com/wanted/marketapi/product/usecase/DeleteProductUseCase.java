package com.wanted.marketapi.product.usecase;

import java.util.UUID;

public interface DeleteProductUseCase {
    boolean deleteProduct(UUID productId);
}
