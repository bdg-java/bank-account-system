package com.bdg.entity;

public class Customer extends  AbstractBankEntity{
    private String customerName;
    private String customerSurName;
    private Address customerAddress;

    public Customer( String customerName, String customerSurName, Address customerAddress){
        this.customerName = customerName;
        this.customerSurName = customerSurName;
        this.customerAddress = customerAddress;
    }



    public String toString(){
        return "customer : {" +
                "CustomerName :" +
                customerName + "," +
                "CustomerSurName :" + customerSurName + "," +
                "customerAddress :" + customerAddress +
                "}";
    }
}
