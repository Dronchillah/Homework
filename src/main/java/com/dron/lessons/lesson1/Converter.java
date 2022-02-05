package com.dron.lessons.lesson1;

import com.sun.deploy.util.ArrayUtil;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

import java.io.ByteArrayInputStream;
import java.util.*;

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

    public static String[] binaryToOctal(String[] array) {
        String[] processed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            Character[] characters = ArrayUtils.toObject(array[i].toCharArray());
            Deque<Character> dequeue = new LinkedList<Character>(Arrays.asList(characters));

            String number = "";

            for (int j = dequeue.size() - 1; j >= 0; ) {
                if (dequeue.isEmpty()) {
                    break;
                } else if (dequeue.size() == 2) {
                    int x = Integer.parseInt(String.valueOf(dequeue.removeLast()));
                    int y = Integer.parseInt(String.valueOf(dequeue.removeLast()));
                    Character ch = Character.forDigit(x + y * 2, 10);
                    number = ch + number;
                } else if (dequeue.size() == 1) {
                    Character ch = Character.forDigit(Integer.parseInt(String.valueOf(dequeue.removeLast())), 10);
                    number = ch + number;
                } else {
                    int x = Integer.parseInt(String.valueOf(dequeue.removeLast()));
                    int y = Integer.parseInt(String.valueOf(dequeue.removeLast()));
                    int z = Integer.parseInt(String.valueOf(dequeue.removeLast()));
                    Character ch = Character.forDigit(x + y * 2 + z * 4, 10);
                    number = ch + number;
                }

            }
            processed[i] = number;
        }
        return processed;
    }
}

