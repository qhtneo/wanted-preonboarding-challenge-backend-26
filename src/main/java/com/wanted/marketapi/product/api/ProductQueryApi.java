package com.wanted.marketapi.product.api;

import com.wanted.marketapi.product.domain.Product;
import com.wanted.marketapi.product.service.proxy.ProductReadProxyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("products")
public class ProductQueryApi {
    private final ProductReadProxyService productReadProxyService;

    @GetMapping("/{productId}")
    public Product findById(@PathVariable("productId") UUID productId) {
        return productReadProxyService.findByID(productId);
    }

    @GetMapping
    public List<Product> findAll(@PageableDefault(size = 10) Pageable pageable){
        pageable = pageable.previousOrFirst();
        return productReadProxyService.findALL(pageable);
    }
}
