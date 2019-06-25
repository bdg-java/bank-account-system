package com.bdg.common.exception;

public class NumericCodeNotFoundException extends  RuntimeException {
    private final String DEFAULT_MESSAGE = "Numeric code not found with the number %s ... ";
    private final String message;

    public NumericCodeNotFoundException(String numercCode) {
        this.message = String.format(DEFAULT_MESSAGE, numercCode);
    }

    public String getMessage() {
        return this.message;
    }
}
