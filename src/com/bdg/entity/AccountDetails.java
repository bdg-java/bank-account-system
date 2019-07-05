package com.bdg.entity;

public class AccountDetails extends AbstractBankEntity {
    private CreditCard info;
//    private Account id;

    public AccountDetails(CreditCard info, Account id){
       this.info = info;
//       this.id = id;
    }




}
