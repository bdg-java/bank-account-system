package com.ashahbazyan.storage;

import com.ashahbazyan.entity.BankEntity;

public interface Storage<T extends BankEntity> {
    T add(T entity);

    T remove(int id);

    T get(int id);


}
