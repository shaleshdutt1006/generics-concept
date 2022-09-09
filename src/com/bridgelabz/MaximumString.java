package com.bridgelabz;

import java.util.Arrays;

public class MaximumString<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void testCase1(T str[]) {
        T max = str[0];
        if (str[1].compareTo(max) > 0) {
            max = str[1];
        }
        if (str[2].compareTo(max) > 0) {
            max = str[2];
        }
        if (str[3].compareTo(max) > 0) {
            max = str[3];
        }
        if (str[4].compareTo(max) > 0) {
            max = str[4];
        }
        System.out.println("Maximum value in the string is : " + max);
    }

    public static <T extends Comparable<T>> void testCase2(T str[]) {
        Arrays.sort(str);

        System.out.println("Second maximum value in the string is : " + str[str.length - 2]);

    }

    public static <T extends Comparable<T>> void testCase3(T str[]) {
        Arrays.sort(str);
        System.out.println("Third maximum value in the string is : " + str[str.length - 3]);

    }

    public static void main(String[] args) {

        String[] str = {"apple", "banana", "peach", "pineapple", "orange"};

        testCase1(str);
        testCase2(str);
        testCase3(str);
    }
}

