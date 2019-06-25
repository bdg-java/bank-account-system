package com.bdg;


import com.bdg.common.enums.Country;
import com.bdg.common.enums.CountryPhoneCode;
import com.bdg.common.enums.PhoneType;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.entity.PhoneNumber;
import com.bdg.service.creditcard.CreditCardCrudService;
import com.bdg.service.creditcard.CreditCardNumberGenerator;
import com.bdg.service.creditcard.CreditCardService;
import com.bdg.service.customer.CustomerCrudService;
import com.bdg.service.customer.CustomerService;
import com.bdg.storage.creditcard.CustomerStorage;

/**
 * @author William Arustamyan
 */


public class BankAccountSystem {


    public static void main(String[] args) {
//        CreditCardService service = new CreditCardCrudService();
//        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
//        service.create(generator.generate(), 10, "10-10-2020", "VISA");
//        System.out.println(service.get(1));
        CustomerService customer = new CustomerCrudService();

        PhoneNumber phoneNumber = new PhoneNumber(CountryPhoneCode.AM,"7782", PhoneType.HOME);
        Address address = new Address(Country.AM,"2nd",phoneNumber);
       Customer customer1 =  customer.create("John","Nash",address);
        System.out.println(customer);


    }
}
