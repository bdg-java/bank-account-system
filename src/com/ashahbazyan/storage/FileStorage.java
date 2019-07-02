package com.ashahbazyan.storage;

import com.ashahbazyan.entity.BankEntity;

import java.io.File;
import java.io.IOException;

public class FileStorage<T extends BankEntity> implements Storage<T> {

    private File fileStorage;
    public FileStorage(String directory,String name,String extension) throws IOException
    {
        if(new File(directory).mkdir()){
            this.fileStorage = new File(directory+"/"+name+"."+extension);
            fileStorage.createNewFile();
        }

    }

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
