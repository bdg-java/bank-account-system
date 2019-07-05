package com.bdg.common.exception;

public class PhoneTypeNotFoundException extends RuntimeException {

    private final String message;
    public PhoneTypeNotFoundException(int id) {

        this.message = "customer with id {" + id + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}
