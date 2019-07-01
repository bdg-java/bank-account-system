package com.ashahbazyan.storage;

import com.ashahbazyan.entity.BankEntity;

public class MemoryStorage<T extends BankEntity> implements Storage<T> {
    private BankEntity[] container;
    private int currentStorageIndex;
    private int storageSize;

    public MemoryStorage(int storageSize) {
        this.storageSize = storageSize;
        container = new BankEntity[storageSize];
    }

    @Override
    public T add(T entity) {

        if (storageSize == currentStorageIndex) {
            increaseSize();
        }
        this.container[currentStorageIndex] = entity;
        currentStorageIndex++;
        return entity;
    }

    private void increaseSize() {
        BankEntity[] bankEntities =  new BankEntity[container.length+ (container.length/2)];
        System.arraycopy(container,0,bankEntities,0,container.length);
        container = bankEntities;

    }

    @Override
    public T remove(int id) {
        return null;
    }

    @Override
    public T get(int id) {
        return null;
    }
}
