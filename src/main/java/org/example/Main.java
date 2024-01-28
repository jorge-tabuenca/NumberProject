package org.example;

public class Main {
    public static void main(String[] args) {
        String vin = "VIN";
        String cle = "CLE";

        for(int num = 1; num <= 100; ++num) {
            if (num % 3 == 0) {
                if (num % 5 == 0) {
                    System.out.println(vin + cle);
                } else {
                    System.out.println(vin);
                }
            } else if (num % 5 == 0) {
                if (num % 3 == 0) {
                    System.out.println(vin + cle);
                } else {
                    System.out.println(cle);
                }
            } else {
                System.out.println(num);
            }
        }
    }
}