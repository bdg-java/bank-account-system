package com.bdg.common.enums;

public enum  Country {
    AM("Armenia","051"),
    FR("FRANCE","054"),
    AU("Australia","036"),
    BR("Brazil","045"),
    CN("China","087"),
    MX("Mexico","034");
    private String countryName;
    private String countryCode;
    Country(String countryName,String countryCode){
        this.countryName = countryName;
        this.countryCode = countryCode;
    }



}