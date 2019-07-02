package com.ashahbazyan.entity;

import com.ashahbazyan.common.Country;

public class Address extends BankEntity{
    private String phoneNumber;
    private String street;
    private Country country;

    public Address(String phoneNumber, String street, Country country) {
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.country = country;
    }


}
