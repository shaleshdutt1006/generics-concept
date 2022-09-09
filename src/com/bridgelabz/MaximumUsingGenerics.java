package com.bridgelabz;

public class MaximumUsingGenerics {

    public static <T extends Comparable<T>> void getMax(T... a) {
        T max = a[0];

        for (int i =1 ; i< a.length ; i++) {

            if (a[i].compareTo(max) > 0) {

                max = a[i];
            }
        }

        System.out.println("The maximum value is : " + max);
    }
    public static void main(String[] args) {

        getMax(2,20, 6, 7 ,21);

        getMax("apple", "banana", "peach", "strawberry");

        getMax(2.5, 6.9, 7.8, 9.8);

    }
}
