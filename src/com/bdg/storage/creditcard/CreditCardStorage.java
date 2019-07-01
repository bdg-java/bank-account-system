package com.bdg.storage.creditcard;


import com.bdg.common.exception.CreditCardNotFoundException;
import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.CreditCard;
import com.bdg.storage.Storage;

import java.time.LocalDate;

/**
 * @author William Arustamyan
 */


public final class CreditCardStorage implements Storage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private CreditCard[] container;
    private int storageSize;
    private final double incSize;

    private int currentStorageIndex = 0;

    public CreditCardStorage(int storageSize) {
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
        this.incSize = 1.5;
    }

    public CreditCardStorage(int storageSize, int incSize) {
        this.incSize = incSize;
        this.storageSize = storageSize;
        this.container = new CreditCard[this.storageSize];
    }

    public CreditCardStorage() {
        this(DEFAULT_STORAGE_SIZE);
    }

    @Override
    public int storageSize() {
        return this.storageSize;
    }

    @Override
    public boolean add(AbstractBankEntity entity) {
        if (this.storageSize == currentStorageIndex) {
            incStorageSize();
        }
        entity.setId(currentStorageIndex + 1);
        entity.setCreated(LocalDate.now());

        this.container[currentStorageIndex] = (CreditCard) entity;
        currentStorageIndex++;
        return true;
    }

    @Override
    public boolean remove(int id) {
        for (int i = 0; i < container.length; i++) {
            if (container[i] != null && container[i].getId() == id) {
                container[i].setActive((byte) 0);
                return true;
            }
        }
        return false;
    }

    @Override
    public AbstractBankEntity get(int id) {
        for (CreditCard creditCard : container) {
            if (creditCard != null && creditCard.getId() == id && creditCard.getActive() == 1) {
                return creditCard;
            }
        }
        return null;
    }

    private void incStorageSize() {
        CreditCard[] cards = new CreditCard[currentStorageIndex + (int) (currentStorageIndex * incSize)];
        System.arraycopy(this.container, 0, cards, 0, this.container.length);
        this.container = cards;
        this.storageSize = this.container.length;
    }
}
