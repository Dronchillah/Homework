package com.dron.lessons.lesson1;

import java.util.Arrays;


public class LessonOneMain {

    public static void main(String[] args) {
        String[] binaryValues = {"0000000110011001", "0011100011001000", "0011001001001101", "0000110000000101", "0011111010111110", "0111001011111000", "0011001100111001"};
        System.out.println(Arrays.toString(Converter.binaryToDecimal(binaryValues)));
        System.out.println(Arrays.toString(Converter.binaryToOctal(binaryValues)).replaceAll("0", ""));

    }



}
