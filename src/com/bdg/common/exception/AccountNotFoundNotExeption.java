package com.bdg.common.exception;

public class AccountNotFoundNotExeption extends RuntimeException {
    private final String message;
    public AccountNotFoundNotExeption(int id) {

        this.message = "Account with id {" + id + "} not found ...";
    }

    public String getMessage() {
        return this.message;
    }
}

