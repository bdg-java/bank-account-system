package com.bdg.storage.account;

import com.bdg.common.exception.AccountNotFoundNotExeption;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.Account;
import com.bdg.storage.Storage;

import java.time.LocalDate;

public class AccountStorage implements Storage {
    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Account[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public AccountStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];
        this.incSize = 1.5;
    }

    public AccountStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new Account[this.storageSize];
    }

    public AccountStorage() {
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

        this.container[currentStorageIndex] = (Account) entity;
        currentStorageIndex++;
        return true;
    }

    public boolean remove(int id) {
        AbstractBankEntity account = get(id);
        currentStorageIndex--;
        account.setDeleted(LocalDate.now());
        if (account == null) {
            throw new AccountNotFoundNotExeption(id);
        }
        return true;
    }

    public AbstractBankEntity get(int id) {
        if (id - 1 > this.currentStorageIndex) {
            throw new AccountNotFoundNotExeption(id);
        }

        return this.container[id -1];
    }

    private void incStorageSize() {
        Account[] accounts = new Account[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, accounts, 0, this.container.length);
        this.container = accounts;
        this.storageSize = this.container.length;
    }
}
