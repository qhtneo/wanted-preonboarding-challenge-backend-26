package com.wanted.marketapi.exception;


import com.wanted.marketapi.support.exception.CustomException;
import com.wanted.marketapi.support.exception.ErrorCode;

public class ProductException extends CustomException {
    public ProductException() {
        super();
    }

    public ProductException(String message) {
        super(message);
    }

    public ProductException(String message, Throwable cause) {
        super(message, cause);
    }
    public ProductException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ProductException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

}
