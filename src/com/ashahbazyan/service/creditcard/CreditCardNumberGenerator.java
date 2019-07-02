package com.ashahbazyan.service.creditcard;

import java.util.Random;

public class CreditCardNumberGenerator {

    public static int generateCvvCode() {
        Random random = new Random();
        return random.nextInt(900) + 100;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int cvv = random.nextInt(900) + 100;
        System.out.println(cvv);
    }
}
