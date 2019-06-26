package com.bdg.entity;

public class Account extends AbstractBankEntity{
    private Customer customer;
    private AccountDetails accountDetails;
    private AccountBalance accountBalance;


    public Account ( Customer customer, AccountDetails accountDetails, AccountBalance accountBalance){
        this.customer = customer;
        this.accountDetails = accountDetails;
        this.accountBalance = accountBalance;
    }

    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
