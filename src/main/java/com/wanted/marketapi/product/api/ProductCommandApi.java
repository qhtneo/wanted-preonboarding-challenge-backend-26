package com.wanted.marketapi.product.api;

import com.wanted.marketapi.product.dto.ProductDeleteDto.ProductDeleteResponseDto;
import com.wanted.marketapi.product.dto.ProductSaveDto.ProductSaveRequestDto;
import com.wanted.marketapi.product.dto.ProductSaveDto.ProductSaveResponseDto;
import com.wanted.marketapi.product.dto.ProductUpdateDto;
import com.wanted.marketapi.product.dto.ProductUpdateDto.ProductStatusUpdateResponseDto;
import com.wanted.marketapi.product.service.proxy.ProductDeleteProxyService;
import com.wanted.marketapi.product.service.proxy.ProductSaveProxyService;
import com.wanted.marketapi.product.service.proxy.ProductStatusUpdateProxyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public final class ProductCommandApi {
    private final ProductSaveProxyService productSaveProxyService;
    private final ProductDeleteProxyService productDeleteProxyService;
    private final ProductStatusUpdateProxyService productStatusUpdateProxyService;
    @PostMapping
    public ProductSaveResponseDto saveProduct(@RequestBody ProductSaveRequestDto body) {
        return productSaveProxyService.saveProduct(body);
    }

    @DeleteMapping("{productId}")
    public ProductDeleteResponseDto deleteProduct(@PathVariable UUID productId) {
        return productDeleteProxyService.productDelete(productId);
    }

    @PutMapping("{productId}/status")
    public ProductStatusUpdateResponseDto updateProductStatus(
            @PathVariable UUID productId,
            @RequestBody @Valid ProductUpdateDto.ProductStatusUpdateRequestDto body
    ) {
        return productStatusUpdateProxyService.productStatusUpdate(productId, body.status());
    }
}

