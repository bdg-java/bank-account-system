package com.bdg.entity;

import com.bdg.common.Country;

public class Address extends  AbstractBankEntity{
    private Country country;
    private String steet;
//    private PhoneNumber phonenumber[];


    public Address( Country country, String steet){
        this.country = country;
        this.steet = steet;
//        this.phonenumber = new phonenumber[];

    }

 public String toString() {
     return "Address :" + "{" +
             "Country: " + country + " " +
             "Street: " + steet +
             "}";
 }

}
