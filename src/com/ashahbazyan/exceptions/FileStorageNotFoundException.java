package com.ashahbazyan.exceptions;

public class FileStorageNotFoundException extends RuntimeException {
    private  final  String errorMsg ;
    public FileStorageNotFoundException(){
       errorMsg ="file not found";
    }
    public String getMessage() {
        return errorMsg;
    }
}
