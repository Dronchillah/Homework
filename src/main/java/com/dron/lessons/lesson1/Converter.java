package com.dron.lessons.lesson1;

public class Converter {

    public static int[] binaryToDecimal(String[] array) {

        int[] processed = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            char[] digitsFromNumber = array[i].toCharArray(); //Двоичное в массив символов
            int power = (int) Math.pow(2, digitsFromNumber.length - 1); //Делитель
            int number = 0;

            for (char ch : digitsFromNumber) {
                int x = Integer.parseInt(String.valueOf(ch));
                number += x * power;
                power = power / 2;
            }

            processed[i] = number;
        }

        return processed;
    }
}
