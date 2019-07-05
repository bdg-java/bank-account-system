package com.bdg.storage.address;

import com.bdg.common.exception.AddressNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Address;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class AddressStorage implements Storage {
    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Address[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public AddressStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];
        this.incSize = 1.5;
    }

    public AddressStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Address[this.storageSize];
    }

    public AddressStorage() {
        this(DEFAULT_STORAGE_SIZE);
    }


    public int storageSize() {
        return this.storageSize;
    }


    public boolean add(AbstractBankEntity entity) {
        if (this.storageSize == currentStorageIndex) {
            incStorageSize();
        }
        entity.setId(currentStorageIndex + 1);
        entity.setCreated(LocalDate.now());

        this.container[currentStorageIndex] = (Address) entity;
        currentStorageIndex++;
        return true;
    }

    public boolean remove(int id) {
        AbstractBankEntity customers = get(id);
        currentStorageIndex--;
        customers.setDeleted(LocalDate.now());
        if (customers == null) {
            throw new AddressNotFoundException(id);
        }

        return true;


    }

    public AbstractBankEntity get(int id) {
        if (id - 1 > this.currentStorageIndex) {
            throw new AddressNotFoundException(id);
        }

        return this.container[id - 1];
    }

    private void incStorageSize() {
        Address[] cards = new Address[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, cards, 0, this.container.length);
        this.container = cards;
        this.storageSize = this.container.length;
    }
}
