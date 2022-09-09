package com.bridgelabz;

public class PrintArrayUsingGenerics {

    public static <E> void toPrint(E[] array) {
        // Generics methods is used in method overloading
        for (E elements : array) {

            System.out.println(elements);
        }

    }


    public static void main(String[] args) {

        Integer[] intarray = {2, 5, 6, 7, 8};

        Double[] doublearray = {2.2, 5.6789, 3.4, 4.5, 6.7, 8.9};

        Character[] chararray = {'a', 'v', 'b', 'r', 'e', 'r'};

        PrintArrayUsingGenerics.toPrint(intarray);

        PrintArrayUsingGenerics.toPrint(doublearray);

        PrintArrayUsingGenerics.toPrint(chararray);

    }
}
