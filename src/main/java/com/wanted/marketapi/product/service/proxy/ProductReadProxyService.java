package com.wanted.marketapi.product.service.proxy;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.usecase.ReadProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductReadProxyService {
    private final ReadProductUseCase readProductUseCase;

    public Product findByID(Long productId) {
        return readProductUseCase.findById(productId);
    }
    public List<Product> findALL(Pageable pageable){
        return readProductUseCase.findAll(pageable);
    }
}
