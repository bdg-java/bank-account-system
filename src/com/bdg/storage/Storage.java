package com.bdg.storage;


import com.bdg.entity.AbstractBankEntity;
import com.bdg.entity.CreditCard;

/**
 * @author William Arustamyan
 */


public interface Storage {

    int storageSize();

    boolean add(AbstractBankEntity entity);

    boolean remove(int id);

    AbstractBankEntity get(int id);

}
