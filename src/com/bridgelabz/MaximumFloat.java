package com.bridgelabz;

public class MaximumFloat<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T useCase1(T a, T b, T c, T d) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (d.compareTo(max) > 0) {
            max = d;
        }

        return max;
    }

    public static <T extends Comparable<T>> void testCase2(T[] floatarray) {
        T swap;

        for (int i = 1; i < floatarray.length; i++) {
            for (int j = i; j > 0; j--) {

                if (floatarray[j].compareTo(floatarray[j - 1]) < 0) {
                    swap = floatarray[j];
                    floatarray[j] = floatarray[j - 1];
                    floatarray[j - 1] = swap;
                }
            }
        }
        System.out.println("Maximum value at Second Position is : " + floatarray[floatarray.length - 2]);
    }

    public static <T extends Comparable<T>> void testCase3(T[] array) {
        T swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;

                }
            }
        }
        System.out.println("Maximum value at third position is : " + array[array.length - 3]);
    }

    public static void main(String[] args) {
        Float a = 4.5f, b = 5.6f, c = 7.9f, d = 9.7f;
        System.out.println("The maximum value is " + useCase1(a, b, c, d));
        Float array[] = {10.5f, 6.9f, 7.2f, 15.9f, 11.25f, 2.2f};

        MaximumFloat<Integer> maximumFloat = new MaximumFloat<>();

        maximumFloat.testCase2(array);

        testCase3(array);

    }
}
