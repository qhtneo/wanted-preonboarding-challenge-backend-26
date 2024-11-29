package com.wanted.marketapi.product.mapper;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toDomain(ProductEntity entity);
    ProductEntity toEntity(Product product);
}
