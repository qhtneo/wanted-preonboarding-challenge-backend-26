package com.wanted.marketapi.product.persistence;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.domain.ProductStatus;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
     Product save(Product product);

     Optional<Product> findById(Long id);


     List<Product> findAll(Pageable pageable);

     boolean deleteProduct(Long productId);

     boolean updateProductStatus(Long productId, ProductStatus status);
}
