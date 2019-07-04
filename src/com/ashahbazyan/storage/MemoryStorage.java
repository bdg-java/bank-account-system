package com.ashahbazyan.storage;

import com.ashahbazyan.entity.BankEntity;

import java.time.LocalDate;

public class MemoryStorage<T extends BankEntity> implements Storage<T> {
    private BankEntity[] container;
    private int currentStorageIndex;

    public MemoryStorage(int storageSize) {
        container = new BankEntity[storageSize];
    }

    @Override
    public T add(T entity) {

        if (currentStorageIndex == container.length) {
            increaseSize();
        }
        entity.setId(currentStorageIndex + 1);
        entity.setCreated(LocalDate.now());
        this.container[currentStorageIndex] = entity;
        currentStorageIndex++;
        return entity;
    }

    private void increaseSize() {
        BankEntity[] bankEntities = new BankEntity[container.length + (container.length / 2)];
        System.arraycopy(container, 0, bankEntities, 0, container.length);
        container = bankEntities;

    }

    @Override
    public T remove(int id) {
        //BankEntity[] newBankEntity = new BankEntity[container.length];
        BankEntity removed = null;
        for (int i = 0; i < container.length; i++) {
            if (container[i].getId() == id) {
                removed = this.container[i];
                container[i] = null;
            }
        }
//        newBankEntity = container;
        return null;
    }

    @Override
    public T get(int id) {
        for (BankEntity bankEntity : container) {
            if (bankEntity != null && bankEntity.getId() == id) {
                return (T) bankEntity;
            }
        }
        return null;
    }
}

