package com.bdg.entity;

import com.bdg.common.enums.Country;

public class Address {
    private Country country;
    private String street;
    private PhoneNumber phoneNumber;

    public Address(Country country, String street, PhoneNumber phoneNumber) {
        this.country = country;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", street='" + street + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
