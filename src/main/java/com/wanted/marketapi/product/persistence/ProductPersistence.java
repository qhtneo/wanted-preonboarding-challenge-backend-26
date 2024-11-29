package com.wanted.marketapi.product.persistence;


import com.wanted.marketapi.exception.ProductErrorCode;
import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import com.wanted.marketapi.product.entity.ProductEntity;
import com.wanted.marketapi.product.mapper.ProductEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
@RequiredArgsConstructor
public class ProductPersistence implements ProductRepository {
    private final ProductJpaRepository productJpaRepository;
    private final ProductEntityMapper mapper;

    @Override
    public Product save(Product product) {
        ProductEntity productEntity = mapper.toEntity(product);
        ProductEntity savedEntity = productJpaRepository.save(productEntity);

        return mapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        Optional<ProductEntity> productEntity = productJpaRepository.findById(id);
        return productEntity.map(mapper::toDomain);
    }

    @Override
    public List<Product> findAll(Pageable pageable) {
        List<ProductEntity> productPage = productJpaRepository.findAllBy(pageable);
        return productPage
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public boolean deleteProduct(UUID productId) {
        boolean isProduct = productJpaRepository.existsById(productId);
        if(!isProduct) {
            return false;
        }
        productJpaRepository.deleteById(productId);
        return true;
    }

    @Override
    public boolean updateProductStatus(UUID productId, ProductStatus status) {
        ProductEntity product = productJpaRepository.findById(productId)
                .orElseThrow(ProductErrorCode.PRODUCT_NOT_FOUND::defaultException);
        product.status = status;

        productJpaRepository.save(product);
        return true;
    }

}
