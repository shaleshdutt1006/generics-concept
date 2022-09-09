package com.bridgelabz;

public class MaximumMoreParameters<T extends Comparable<T>> {
    T[] a;
    public MaximumMoreParameters(T...a) {
        this.a =a ;

    }
    public T maximum(){
        return MaximumMoreParameters.maximum(a);
    }
    public static <T extends Comparable<T>> T maximum(T...a) {
        T max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i];
            }
        }
        printMax(a , max);
        return max;
    }
    private static <T> void printMax(T a , T max) {

        System.out.println("Maximum value is " + max);
    }

    public static void main(String[] args) {
        Integer xint = 2, yint = 6, zint = 5 , bint =7 ,cint =9 ;

        Character xchar = 'a', ychar = 'b', zchar = 'd' , cchar = 't' , dchar='f' ;

        Float xfloat = 2.5f, yfloat = 5.6f, zfloat = 6.9f , afloat = 10.4f , bfloat=6.9f;

        new MaximumMoreParameters(xint,yint,zint,bint,cint).maximum();

        new MaximumMoreParameters(xchar,ychar,zchar,cchar,dchar).maximum();

        new MaximumMoreParameters(xfloat,yfloat,zfloat,afloat,bfloat).maximum();
    }
}
