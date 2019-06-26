package com.bdg.common.exception;

public class CustomerNotFoundException extends RuntimeException {

    private final String errorMessage;
    public CustomerNotFoundException(String name){
        this.errorMessage = "Customer with name "+ name +" not found";

    }
    public CustomerNotFoundException(int id){
        this.errorMessage = "Customer with id "+ id +" not found";

    }

    public String getErrorMessage(){
        return errorMessage;
    }
}
