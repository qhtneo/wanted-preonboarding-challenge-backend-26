package com.wanted.marketapi.product.service.proxy;

import com.wanted.marketapi.product.domain.ProductStatus;
import com.wanted.marketapi.product.dto.ProductUpdateDto.ProductStatusUpdateResponseDto;
import com.wanted.marketapi.product.usecase.UpdateProductStatusUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductStatusUpdateProxyService {
    private final UpdateProductStatusUseCase updateProductStatusUseCase;

    public ProductStatusUpdateResponseDto productStatusUpdate(UUID productId, ProductStatus status) {
        boolean result = updateProductStatusUseCase.updateProductStatus(productId, status);
        return ProductStatusUpdateResponseDto.builder()
                .success(result)
                .build();
    }
}
