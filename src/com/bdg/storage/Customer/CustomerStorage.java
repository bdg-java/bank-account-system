package com.bdg.storage.Customer;

import com.bdg.common.exception.CustomerNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Customer;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class CustomerStorage extends AbstractBankEntity {

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
    public boolean addCustomer(Customer customers) {

        if (this.storageSize == currentStorageIndex) {
            this.incStorageSize();
        }
        this.container[currentStorageIndex] = customers;
        currentStorageIndex++;
        return true;
    }


    public boolean removeCustomer(Customer customers) {
        int removed = -1;
        for (int i = 0; i < currentStorageIndex; i++) {
            if (this.container[i] != null)
                if (this.container[i].equals(container))
                    removed = i;
        }


        Customer[] lengthOfCustomer = new Customer[currentStorageIndex];
        int k = 0;
        for (int i = 0; i < currentStorageIndex; i++)
            if(i != removed) {
                lengthOfCustomer[k++] = this.container[i];
            }
        this.container = lengthOfCustomer;
        currentStorageIndex--;


        return true;
    }

    private void incStorageSize() {
        Customer[] customers = new Customer[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }




}
