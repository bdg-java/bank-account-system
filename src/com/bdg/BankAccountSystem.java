package com.bdg;


import com.bdg.common.enums.Country;
import com.bdg.common.enums.CountryPhoneCode;
import com.bdg.common.enums.PhoneType;
import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import com.bdg.entity.PhoneNumber;
import com.bdg.service.customer.CustomerCrudService;
import com.bdg.service.customer.CustomerService;

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
       Customer customer1 =  customer.create("John1","Nash",address);
       Customer customer2 =  customer.create("John2","Nash",address);
       Customer customer3 =  customer.create("John3","Nash",address);
       Customer customer4 =  customer.create("John4","Nash",address);
       Customer customer5 =  customer.create("John5","Nash",address);
       Customer customer6 =  customer.create("John6","Nash",address);
       Customer customer7 =  customer.create("John7","Nash",address);
       Customer customer8 =  customer.create("John8","Nash",address);
       Customer customer9 =  customer.create("John9","Nash",address);
       Customer customer10 =  customer.create("John10","Nash",address);
       Customer customer11 =  customer.create("John11","Nash",address);
        System.out.println(customer.get("araks"));


    }
}
