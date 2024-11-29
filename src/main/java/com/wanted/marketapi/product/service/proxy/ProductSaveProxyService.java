package com.wanted.marketapi.product.service.proxy;


import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import com.wanted.marketapi.product.dto.ProductSaveDto.ProductSaveRequestDto;
import com.wanted.marketapi.product.dto.ProductSaveDto.ProductSaveResponseDto;
import com.wanted.marketapi.product.mapper.ProductDtoMapper;
import com.wanted.marketapi.product.usecase.SaveProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductSaveProxyService {
    private final SaveProductUseCase saveProductUseCase;
    private final ProductDtoMapper productDtoMapper;

    public ProductSaveResponseDto saveProduct(ProductSaveRequestDto dto){
        Product product = productDtoMapper.from(dto, ProductStatus.RESERVED);
        saveProductUseCase.saveProduct(product);

        return ProductSaveResponseDto.builder()
                .success(true)
                .build();
    }

}
