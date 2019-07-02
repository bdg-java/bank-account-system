package com.ashahbazyan;

import com.ashahbazyan.entity.Address;
import com.ashahbazyan.entity.Customer;
import com.ashahbazyan.storage.FileStorage;
import com.ashahbazyan.storage.MemoryStorage;
import com.ashahbazyan.storage.Storage;

import java.io.IOException;

public class BankAccountSystemApplication {

    public static void main(String[] args)throws IOException {
        Customer customer = new Customer("aa","bb",new Address());

        Storage<?> storage = new FileStorage("ashahbazyan","aa",".log");
        Storage<?> storageM = new MemoryStorage(12);

    }
}
