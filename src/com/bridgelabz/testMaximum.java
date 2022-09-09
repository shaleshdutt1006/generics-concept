package com.bridgelabz;

public class testMaximum<T extends Comparable<T>> {
    T x, y, z;

    public testMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum() {

        return testMaximum.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        printmax(x, y, z, max);
        return max;

    }

    private static <T> void printmax(T x, T y, T z, T max) {

        System.out.println("Maximum value is " + max);
    }

    public static void main(String[] args) {

        Integer xint = 2, yint = 6, zint = 5;
        Character xchar = 'a', ychar = 'b', zchar = 'z';
        Float xfloat = 2.5f, yfloat = 5.6f, zfloat = 6.9f;

        new testMaximum(xint, yint, zint).maximum();
        new testMaximum(xchar, ychar, zchar).maximum();
        new testMaximum(xfloat, yfloat, zfloat).maximum();


    }
}
