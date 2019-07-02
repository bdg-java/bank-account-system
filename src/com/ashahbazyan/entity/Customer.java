package com.ashahbazyan.entity;

public class Customer extends BankEntity{
    private String firstName;
    private String lastName;
    private Address address;

    public Customer(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

}
