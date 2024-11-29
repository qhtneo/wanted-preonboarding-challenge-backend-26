package com.wanted.marketapi.product.mapper;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import com.wanted.marketapi.product.dto.ProductSaveDto.ProductSaveRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductDtoMapper {
    Product from(ProductSaveRequestDto dto, ProductStatus status);
}
