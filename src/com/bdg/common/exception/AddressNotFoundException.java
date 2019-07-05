package com.bdg.common.exception;

public class AddressNotFoundException extends RuntimeException{
    private final String message;
    public AddressNotFoundException(int id) {

        this.message = "address with id {" + id + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }


}
