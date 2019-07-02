package com.ashahbazyan.service;

import com.ashahbazyan.entity.BankEntity;

public interface BankAccountBaseService<T extends BankEntity, R> {
    int STORAGE_SIZE = 10;

    T create(R request);

    T get(int id);

    T remove(int id);

}
