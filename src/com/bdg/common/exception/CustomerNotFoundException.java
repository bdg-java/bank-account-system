package com.bdg.common.exception;

public class CustomerNotFoundException extends RuntimeException {
    private final String message;
    public CustomerNotFoundException(int id) {

        this.message = "customer with id {" + id + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}
