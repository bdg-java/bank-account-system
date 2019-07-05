package com.bdg;

import com.bdg.common.Country;
import com.bdg.common.CountryCode;
import com.bdg.common.PhoneType;
import com.bdg.entity.*;
import com.bdg.service.creditcard.*;
import com.bdg.storage.account.AccountStorage;
import com.bdg.storage.customer.CustomerStorage;

import static com.bdg.common.CardType.VISA;
import static com.bdg.common.CountryCode.ARM;


/**
 * @author William Arustamyan
 */


public class BankAccountSystem {


    public static void main(String[] args) {
        CreditCardService service = new CreditCardCrudService();
        CreditCardNumberGenerator generator = new CreditCardNumberGenerator();
        service.create(generator.generate(), 10, "10-10-19", "VISA");
        System.out.println(service.get(1));


//        Create and add Customer

        CustomerCrudService customerService = new CustomerCrudService();

        CustomerStorage customerStorage = new CustomerStorage();


        PhoneNumber[] phoneNumber = new PhoneNumber[3];
        phoneNumber[1] = new PhoneNumber(ARM,"555 000", PhoneType.HOME);
        phoneNumber[2] = new PhoneNumber(ARM,"444 444", PhoneType.HOME);
        phoneNumber[0] = new PhoneNumber(ARM,"111 111", PhoneType.MOBILE);
        Address address = new Address(Country.AM, "Tigran Mets", phoneNumber);
        Customer one = new Customer("Seda", "Hovsepyan", address);
        customerService.create("Seda","Hovsepyan",address);
        customerStorage.add(one);
        System.out.println("The id of added customer" + customerStorage.get(1));
        System.out.println("The id of created customer" + customerService.get(1));
        System.out.println(customerStorage.storageSize());
        System.out.println(customerStorage.currentStorageIndex);
        PhoneNumber[] phoneNumbers = new PhoneNumber[2];
        phoneNumbers[0] = new PhoneNumber(CountryCode.ARM, "565965", PhoneType.HOME);
        phoneNumbers[1] = new PhoneNumber(CountryCode.ARM, "125465", PhoneType.WORK);

        PhoneNumber[] phoneNumber1 = new PhoneNumber[2];
        phoneNumber1[0] = new PhoneNumber(ARM,"555 555", PhoneType.HOME);
        phoneNumber1[1] = new PhoneNumber(ARM,"555 555", PhoneType.MOBILE);
        Address address1 = new Address(Country.AM, "Tigran Mets", phoneNumber1);
        Customer two = new Customer("Poxos", "Poxosyna", address1);
        customerService.create("Poxos","Poxosyan", address1);
        customerStorage.add(two);
        System.out.println("The id of added customer" + customerStorage.get(2));
        System.out.println("The id of created customer" + customerService.get(2));
        System.out.println(customerStorage.storageSize());
        System.out.println(customerStorage.currentStorageIndex);
        System.out.println("created customer length" + " " + customerService.currentIndex);
        customerStorage.remove(2);
        customerService.remove(1);

        System.out.println(customerStorage.storageSize());
        System.out.println("added customer length" + " " + customerStorage.currentStorageIndex);
        System.out.println("created customer length" + " " + customerService.currentIndex);

//        Create and add account

       AcoountCurdService acoountService = new AcoountCurdService();
        AccountStorage accountStorage = new AccountStorage();

         PhoneNumber[] phoneNumber2 = new PhoneNumber[1];
         phoneNumber2[0] = new PhoneNumber(ARM, "333333", PhoneType.MOBILE);

//        acoountService.create(new Customer("Petros","Petrosyan",
//                new Address(Country.AM,"Qochar", phoneNumber2)),
//
//
////        AccountBalance  balance = new AccountBalance(AccountBalance.getAmount());
//        acoountService.create(
//                customerService.get(1), new AccountDetails(service.get(1),acoountService.get(1))
//        );

    }
}
