package com.bdg.storage.customer;

import com.bdg.entity.Address;
import com.bdg.entity.Customer;
import java.util.Arrays;

public class CustomerStorage {

    private static final int DEFAULT_STORAGE_SIZE = 10;
    private Customer[] container;
    private int currentStorageIndex = 0;
    private int storageSize;
    private int increaseSize;


    public CustomerStorage(int storageSize) {
        this.storageSize = storageSize;
        container = new Customer[storageSize];
        increaseSize = 2;

    }
    public CustomerStorage(int storageSize,int increaseSize) {
        this.storageSize = storageSize;
        container = new Customer[storageSize];
        this.increaseSize = increaseSize;

    }

    public CustomerStorage(){
        this(DEFAULT_STORAGE_SIZE);
    }

    public boolean add(Customer customer){
        if(this.storageSize == currentStorageIndex){
            this.increaseStorageSize();
        }
        customer.setId(currentStorageIndex+1);
        container[currentStorageIndex] = customer;
        currentStorageIndex++;
        return  true;

    }

    public Customer get(String name){
        for (Customer customer : container) {
            if(customer != null && customer.getName() == name){
                return customer;
            }
        }
        return null;
    }


    public boolean remove (int id){
        Customer[] customersListAfterDelete = new Customer[container.length];
        int i=0;
        for (Customer customer : container) {
            if(customer.getId() != id){
                customersListAfterDelete[i] = customer;
                i++;
            }
        }
        return customersListAfterDelete.length == container.length;

    }


    public Customer update(int id, String name, String surname, Address address){

        for (Customer customer : container) {
            if(customer != null && customer.getId() == id){
                customer.setName(name == null ? customer.getName() : name);
                customer.setSurname(surname == null ? customer.getSurname() : surname);
                customer.setAddress(address == null ? customer.getAddress() : address);
                return  customer;
            }
        }

        return null;
    }

    public void increaseStorageSize(){
        Customer[] customer = new Customer[currentStorageIndex + currentStorageIndex*increaseSize];
        System.arraycopy(container,0,customer,0,container.length);
        container = customer;
        this.storageSize = customer.length;

    }

    @Override
    public String toString() {
        return "CustomerStorage{" +
                "container=" + Arrays.toString(container) +
                ", currentStorageIndex=" + currentStorageIndex +
                ", storageSize=" + storageSize +
                ", increaseSize=" + increaseSize +
                '}';
    }
}
