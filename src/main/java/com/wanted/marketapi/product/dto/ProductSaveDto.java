package com.wanted.marketapi.product.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

public record ProductSaveDto() {

    @Builder
    public record ProductSaveRequestDto(

            @NotBlank
            String name,

            @NotBlank
            int price

    ) {}

    @Builder
    public record ProductSaveResponseDto(
            Boolean success
    ) {}
}
