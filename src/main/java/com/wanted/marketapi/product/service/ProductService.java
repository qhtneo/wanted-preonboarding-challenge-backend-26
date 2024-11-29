package com.wanted.marketapi.product.service;

import com.wanted.marketapi.exception.ProductErrorCode;
import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import com.wanted.marketapi.product.persistence.ProductRepository;
import com.wanted.marketapi.product.usecase.DeleteProductUseCase;
import com.wanted.marketapi.product.usecase.ReadProductUseCase;
import com.wanted.marketapi.product.usecase.SaveProductUseCase;
import com.wanted.marketapi.product.usecase.UpdateProductStatusUseCase;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Builder
public class ProductService implements
        SaveProductUseCase,
        ReadProductUseCase,
        DeleteProductUseCase,
        UpdateProductStatusUseCase {

    private final ProductRepository productRepository;

    public List<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
    @Override
    public Product findById(UUID id) {
        return productRepository.findById(id)
                .orElseThrow(ProductErrorCode.PRODUCT_NOT_FOUND::defaultException);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    @Override
    public boolean deleteProduct(UUID productId) {
        return productRepository.deleteProduct(productId);
    }

    @Override
    public boolean updateProductStatus(UUID productId, ProductStatus status) {
        return productRepository.updateProductStatus(productId,status);
    }
}