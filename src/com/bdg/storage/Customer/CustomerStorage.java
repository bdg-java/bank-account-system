package com.bdg.storage.Customer;

import com.bdg.common.exception.CustomerNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Customer;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class CustomerStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int storageSize;
    private final int incSize;

    public int currentStorageIndex = 0;

    public CustomerStorage(int storageSize){
         this.storageSize = storageSize;
         this.container = new Customer[this.storageSize];
         this.incSize = 1;
    }

    public CustomerStorage(int storageSize, int incSize ){

        this.storageSize = storageSize;
        this.incSize = incSize;
        this.container = new Customer[this.storageSize];
    }

    public CustomerStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }


    public int storageSize(){
        return this.storageSize;
    }
    public boolean add(AbstractBankEntity entity) {
        if (this.storageSize == currentStorageIndex) {
            incStorageSize();
        }
        entity.setId(currentStorageIndex + 1);
        entity.setCreated(LocalDate.now());

        this.container[currentStorageIndex] = (Customer) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }


    public AbstractBankEntity get(int id) {
        if (id - 1 > this.currentStorageIndex) {
            throw new CustomerNotFoundException(id);
        }

        return this.container[id -1];
    }


    private void incStorageSize() {
        Customer[] customers = new Customer[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }




}
