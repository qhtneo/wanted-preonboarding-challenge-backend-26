package com.wanted.marketapi.product.persistence;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductRepository {
     Product save(Product product);

     Optional<Product> findById(UUID id);


     List<Product> findAll(Pageable pageable);

     boolean deleteProduct(UUID productId);

     boolean updateProductStatus(UUID productId, ProductStatus status);
}
