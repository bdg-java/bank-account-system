package com.ashahbazyan.entity;

public class Account extends BankEntity {
    private Customer customer;
    private CreditCard creditCard;
    private AccountBalance accountBalance;

    public Account(Customer customer, CreditCard creditCard, AccountBalance accountBalance) {
        this.customer = customer;
        this.creditCard = creditCard;
        this.accountBalance = accountBalance;
    }
}
