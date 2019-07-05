package com.bdg.storage.phoneNumber;

import com.bdg.common.exception.PhoneTypeNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.PhoneNumber;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class PhoneNumberStorage implements Storage {
    private static final int DEFAULT_STORAGE_SIZE = 10;
    private PhoneNumber[] container;
    private int storageSize;
    private final int incSize;

    public int currentStorageIndex = 0;

    public PhoneNumberStorage(int storageSize){
        this.storageSize = storageSize;
        this.container = new PhoneNumber[this.storageSize];
        this.incSize = 1;
    }

    public PhoneNumberStorage(int storageSize, int incSize ){

        this.storageSize = storageSize;
        this.incSize = incSize;
        this.container = new PhoneNumber[this.storageSize];
    }

    public PhoneNumberStorage(){
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

        this.container[currentStorageIndex] = (PhoneNumber) entity;
        currentStorageIndex++;
        return true;
    }

    public boolean remove(int id) {
        AbstractBankEntity customers = get(id);
        currentStorageIndex--;
        customers.setDeleted(LocalDate.now());
        if (customers == null) {
            throw new PhoneTypeNotFoundException(id);
        }

        return true;


    }
    public AbstractBankEntity get(int id) {
        if (id - 1 > this.currentStorageIndex) {
            throw new PhoneTypeNotFoundException(id);
        }

        return this.container[id - 1];
    }
    private void incStorageSize() {
        PhoneNumber[] customers = new PhoneNumber[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, customers, 0, this.container.length);
        this.container = customers;
        this.storageSize = this.container.length;
    }


}
