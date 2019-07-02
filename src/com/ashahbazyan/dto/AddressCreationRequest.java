package com.ashahbazyan.dto;

import com.ashahbazyan.common.Country;

public class AddressCreationRequest {
    public String phoneNumber;
    public String street;
    public Country country;

    public AddressCreationRequest(String phoneNumber, String street, Country country) {
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.country = country;
    }
}
