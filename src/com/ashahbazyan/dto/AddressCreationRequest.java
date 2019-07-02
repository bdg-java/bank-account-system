package com.ashahbazyan.dto;

import com.ashahbazyan.common.Country;

public class AddressCreationRequest {
    public String phoneNumber;
    public String street;
    public String countryName;

    public AddressCreationRequest(String phoneNumber, String street, String countryName) {
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.countryName = countryName;
    }
}
