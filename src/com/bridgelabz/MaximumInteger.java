package com.bridgelabz;



public class MaximumInteger<T extends Comparable<T>> {
    public static <T extends Comparable<T>> void testCase1(T x , T y , T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max =y ;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        System.out.println("The maximum value is : " + max);

    }

    public static <T extends Comparable<T>> void testCase2(T[] intarray) {
        T swap;

        for (int i = 1; i < intarray.length; i++) {
            for (int j = i; j > 0; j--) {

                if (intarray[j].compareTo(intarray[j - 1]) < 0) {
                    swap = intarray[j];
                    intarray[j] = intarray[j - 1];
                    intarray[j - 1] = swap;
                }
            }
        }
        System.out.println("The Second maximum value is : " + intarray[intarray.length - 2]);
    }

    public static <T extends Comparable<T>> void testCase3(T[] intarray) {
        T swap;
        for (int i = 0; i < intarray.length; i++) {
            for (int j = i + 1; j < intarray.length; j++) {
                if (intarray[i].compareTo(intarray[j]) > 0) {
                    swap = intarray[i];
                    intarray[i] = intarray[j];
                    intarray[j] = swap;

                }
            }

        }
        System.out.println("Maximum value at third position is : " + intarray[intarray.length - 3]);
    }

    public static void main(String[] args) {
        Integer x = 5, y = 7, z = 9;

        MaximumInteger.testCase1(x, y, z);

        Integer intarray[] = {10, 6, 7, 15, 11, 2, 9,};

        MaximumInteger.testCase2(intarray);

        MaximumInteger<Integer> maximumInteger = new MaximumInteger<Integer>();

        maximumInteger.testCase3(intarray);



    }
}
