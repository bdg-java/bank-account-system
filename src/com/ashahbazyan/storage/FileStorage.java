package com.ashahbazyan.storage;

import com.ashahbazyan.entity.BankEntity;

public class FileStorage<T extends BankEntity> implements Storage<T> {
    @Override
    public T add(T entity) {
        return null;
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
