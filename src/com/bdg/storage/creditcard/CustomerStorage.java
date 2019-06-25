package com.bdg.storage.creditcard;

import com.bdg.entity.Customer;

import java.util.Arrays;

public class CustomerStorage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int currentStorageIndex = 0;
    private int storageSize;
    private int increaseSize;


    public CustomerStorage(int storageSize) {
        this.storageSize = storageSize;
        container = new Customer[storageSize];
        increaseSize = 2;

    }
    public CustomerStorage(int storageSize,int increaseSize) {
        this.storageSize = storageSize;
        container = new Customer[storageSize];
        this.increaseSize = increaseSize;

    }

    public CustomerStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    public boolean add(Customer customer){
        if(this.storageSize == currentStorageIndex){
            this.increaseStorageSize();
        }
        container[currentStorageIndex+1] = customer;
        currentStorageIndex++;
        return  true;


    }

    public void increaseStorageSize(){
        Customer[] customer = new Customer[currentStorageIndex + currentStorageIndex*increaseSize];
        System.arraycopy(container,0,customer,0,customer.length);
        container = customer;
        this.storageSize = customer.length;

    }

    @Override
    public String toString() {
        return "CustomerStorage{" +
                "container=" + Arrays.toString(container) +
                ", currentStorageIndex=" + currentStorageIndex +
                ", storageSize=" + storageSize +
                ", increaseSize=" + increaseSize +
                '}';
    }
}
