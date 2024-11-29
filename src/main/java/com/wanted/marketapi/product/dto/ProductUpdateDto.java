package com.wanted.marketapi.product.dto;

import com.wanted.marketapi.product.domain.ProductStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public record ProductUpdateDto() {
    @Builder
    public record ProductStatusUpdateRequestDto(
            @NotNull
            ProductStatus status
    ){}
    @Builder
    public record ProductStatusUpdateResponseDto(
            Boolean success
    ) {}
}
