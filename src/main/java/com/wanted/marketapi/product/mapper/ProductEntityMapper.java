package com.wanted.marketapi.product.mapper;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.entity.ProductEntity;
import com.wanted.marketapi.support.mapper.DomainEntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper extends DomainEntityMapper<Product, ProductEntity> {
}
