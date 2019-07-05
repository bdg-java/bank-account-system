package com.bdg.entity;

import com.bdg.common.Country;

import java.util.Arrays;

public class Address extends  AbstractBankEntity{
    private Country country;
    private String steet;
    private PhoneNumber phonenumber[];


    public Address( Country country, String steet, PhoneNumber[] phoneNumber){
        this.country = country;
        this.steet = steet;
        this.phonenumber = phoneNumber;

    }

    public String getSteet() {
        return steet;
    }

    public Country getCountry() {
        return country;
    }

    public PhoneNumber[] getPhonenumber() {
        return phonenumber;
    }

    public void setSteet(String steet) {
        this.steet = steet;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setPhonenumber(PhoneNumber[] phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String toString() {
     return "AddressStorage :" + "{" +
             "Country: " + country + " " +
             "Street: " + steet + " " +
             "phoneNumber" + Arrays.toString(phonenumber) +
             "}";
 }

}
