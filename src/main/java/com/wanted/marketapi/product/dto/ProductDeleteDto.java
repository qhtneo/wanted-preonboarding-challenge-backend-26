package com.wanted.marketapi.product.dto;

import lombok.Builder;

public record ProductDeleteDto() {

    @Builder
    public record ProductDeleteResponseDto(
            Boolean success
    ) {}
}
