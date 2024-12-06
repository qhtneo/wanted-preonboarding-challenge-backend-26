package com.wanted.marketapi.product.service.proxy;


import com.wanted.marketapi.product.dto.ProductDeleteDto.ProductDeleteResponseDto;
import com.wanted.marketapi.product.usecase.DeleteProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDeleteProxyService {
    private final DeleteProductUseCase deleteProductUseCase;

    public ProductDeleteResponseDto productDelete(Long productId) {
        boolean result = deleteProductUseCase.deleteProduct(productId);
        return ProductDeleteResponseDto.builder()
                .success(result)
                .build();
    }
}
