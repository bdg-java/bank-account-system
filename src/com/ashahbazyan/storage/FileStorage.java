package com.ashahbazyan.storage;

import com.ashahbazyan.common.Country;
import com.ashahbazyan.entity.AccountBalance;
import com.ashahbazyan.entity.BankEntity;
import com.ashahbazyan.exceptions.FileStorageNotFoundException;

import java.io.*;
import java.util.Arrays;

public class FileStorage<T extends BankEntity> implements Storage<T> {

    private FileWriter fileWriter;
    public String[] fileData;

    public FileStorage(String directory, String name, String extension) throws IOException {
        AccountBalance country = new AccountBalance(34);
        if (!new File(directory).exists()) {
            new File(directory).mkdir();

        }
        File fileStorage = new File(directory + "/" + name + "." + extension);
        if (fileStorage.exists()) {
            fileWriter = new FileWriter(fileStorage, true);
        } else {
            fileWriter = new FileWriter(fileStorage);
            fileWriter.append("id firstName lastName address ");
        }

        fileWriter.write(System.lineSeparator());
        fileWriter.write("1 araqs sh 2");
        fileWriter.close();


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
        String line;
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader("ashahbazyan" + "/" + "customer" + "." + "txt"));
            while ((bufferReader.readLine()) != null) {
                line = bufferReader.readLine();
                if (line != null) {
                    fileData = line.split(" ");
                }
            }
            System.out.println(fileData[0]);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
