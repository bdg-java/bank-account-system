package com.bdg.common.enums;

public enum  CountryPhoneCode {
    AM("+374",Country.AM),
    FR("+913",Country.FR);
    private String phoneCode;
    private Country country;

    CountryPhoneCode(String phoneCode,Country country){
        this.phoneCode = phoneCode;
        this.country = country;
    }
}
