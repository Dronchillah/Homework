package com.dron.lessons.lesson1;

import java.util.Arrays;


public class LessonOneMain {

    public static void main(String[] args) {
        String[] binaryValues = {"0000000110011001", "0011100011001000", "0011001001001101", "0000110000000101", "0011111010111110", "0111001011111000", "0011001100111001"};
        int[] decimalValues = {234, 430, 540, 123, 260, 170, 904};
        System.out.println(Arrays.toString(Converter.binaryToDecimal(binaryValues)));
        System.out.println(Arrays.toString(Converter.binaryToOctal(binaryValues)).replaceAll("0", ""));
        System.out.println(Arrays.toString(Converter.decimalToBinary(decimalValues)));

        int y = 7;
        double z = 3 * Math.pow(y, 2) + Math.sqrt(Math.pow(y, 3) + 1);
        double s = Math.sqrt(Math.cos(4 * Math.pow(y, 2)) + 7.151);

//        "0000000110011001" = 199
//        "0011100011001000" = 38C8
//        "0011001001001101" = 324D
//        "0000110000000101" = C05
//        "0011111010111110" = 3EBE
//        "0111001011111000" = 72F8
//        "0011001100111001" = 3339

    }



}
