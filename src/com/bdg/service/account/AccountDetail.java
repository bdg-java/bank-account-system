package com.bdg.service.account;

public class AccountDetail {

    private String currency;

    public AccountDetail(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
