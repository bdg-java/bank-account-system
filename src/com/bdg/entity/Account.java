package com.bdg.entity;

public class Account extends AbstractBankEntity{
    private Customer customer;
    private AccountDetails accountDetails;
    private AccountBalance accountBalance;


    public Account ( Customer customer, AccountDetails accountDetails){
        this.customer = customer;
        this.accountDetails = accountDetails;
//        this.accountBalance = accountBalance;
    }

   public String toString(){
        return this.customer + " " + this.accountDetails + " " ;
   }
}
