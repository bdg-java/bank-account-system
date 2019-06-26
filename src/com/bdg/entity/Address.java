package com.bdg.entity;

import com.bdg.common.Country;

public class Address extends  AbstractBankEntity{
    private Country country;
    private String steet;
    private PhoneNumber phonenumber[];


    public Address( Country country, String steet, PhoneNumber phoneNumber){
        this.country = country;
        this.steet = steet;
        this.phonenumber = phonenumber;

    }

 public String toString() {
     return "AddressStorage :" + "{" +
             "Country: " + country + " " +
             "Street: " + steet + " " +
             "phoneNumber" + phonenumber +
             "}";
 }

}
