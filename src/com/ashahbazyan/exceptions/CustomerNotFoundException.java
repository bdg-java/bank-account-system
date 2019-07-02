package com.ashahbazyan.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    private  final  String errorMsg ;
  public   CustomerNotFoundException(int id){
        errorMsg = "Customer with name "+ id +" not found";
    }
}
