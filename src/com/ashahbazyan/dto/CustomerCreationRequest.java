package com.ashahbazyan.dto;

public class CustomerCreationRequest {
        public String firstName;
        public String lastName;
        public AddressCreationRequest addressCreationRequest;

    public CustomerCreationRequest(String firstName, String lastName, AddressCreationRequest addressCreationRequest) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressCreationRequest = addressCreationRequest;
    }
}
