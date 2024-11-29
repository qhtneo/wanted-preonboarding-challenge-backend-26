package com.wanted.marketapi.exception;

import com.wanted.marketapi.support.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum ProductErrorCode  implements ErrorCode {
    PRODUCT_NOT_FOUND("상품을 찾을 수 없습니다.", HttpStatus.NOT_FOUND),
    DEFAULT("상품 시스템 오류", HttpStatus.INTERNAL_SERVER_ERROR);

    public final String message;
    public final HttpStatus status;

    @Override
    public HttpStatus defaultHttpStatus() {
        return status;
    }

    @Override
    public String defaultMessage() {
        return message;
    }

    @Override
    public ProductException defaultException() {
        return new ProductException(this);
    }

    @Override
    public ProductException defaultException(Throwable cause) {
        return new ProductException(this,cause);
    }
}
