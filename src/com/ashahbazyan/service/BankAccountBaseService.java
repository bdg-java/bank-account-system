package com.ashahbazyan.service;

import com.ashahbazyan.entity.BankEntity;

public interface BankAccountBaseService<T extends BankEntity,R> {
    T create(R request);

}
