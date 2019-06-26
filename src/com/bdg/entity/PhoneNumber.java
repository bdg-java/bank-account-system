package com.bdg.entity;


import com.bdg.common.CountryCode;
import com.bdg.common.PhoneType;

public class PhoneNumber extends AbstractBankEntity {

        private CountryCode countryCode;
        private String number;
        private PhoneType phoneType;


        public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
            this.countryCode = countryCode;
            this.number = number;
            this.phoneType = phoneType;

        }


      public String toString(){
            return "PhoneNumber :" +" "+ "{"+
                    "CountryCode :" + " " + countryCode +
                    "Number :" + " " + number +
                    "PhoneType" + " " + phoneType + "}";
      }
}

