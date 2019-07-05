package com.bdg.entity;


import com.bdg.common.CountryCode;
import com.bdg.common.PhoneType;

import java.util.Arrays;

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
            return "Contry:" + " " + this.countryCode + " " +
             "Number:" + " " + this.number + " " +
                    "phoneType:" + " " + this.phoneType;
      }
}

