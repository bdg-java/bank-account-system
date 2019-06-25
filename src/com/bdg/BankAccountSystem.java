package com.bdg;

import com.bdg.common.Country;
import com.bdg.common.CountryCode;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.service.creditcard.*;
import com.bdg.storage.Customer.CustomerStorage;

import static java.util.Calendar.AM;


/**
 * @author William Arustamyan
 */


public class BankAccountSystem {


    public static void main(String[] args) {
        CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "10-10-2020", "VISA");
        System.out.println(service.get(1));

        CustomerCrudService customer = new CustomerCrudService();


        CustomerStorage cust = new CustomerStorage();


        Address address = new Address(Country.AM, "Tigran Mets");
        Customer one = new Customer("Seda","Poxosyan",address );
        cust.addCustomer(one);
        System.out.println(one);


        System.out.println(cust.storageSize());
        System.out.println(cust.currentStorageIndex);


    }
}
