package com.ashahbazyan;

import com.ashahbazyan.entity.Address;
import com.ashahbazyan.entity.Customer;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

public class BankAccountSystemApplication {

    public static void main(String[] args) {
        Customer customer = new Customer("aa","bb",new Address());

        Storage<?> storage = new MemoryStorage<>(12);
        //storage.add();
        System.out.println(storage);
    }
}
