package com.bridgelabz;

import java.util.Arrays;

public class PrintMaxUsingStdOut <T> {
    T[] inputarray;

    public PrintMaxUsingStdOut(T[] inputarray) {
        this.inputarray =inputarray ;

    }
    public void printMax(){

        PrintMaxUsingStdOut.printMax(this.inputarray);
    }

    public static <T> void printMax(T[] inputarray) {
        for (T elements : inputarray){
            System.out.printf("%s" ,  elements + ",");
        }
        System.out.println();


        Arrays.sort(inputarray);

        System.out.println("Max value of the Inputs is : " + inputarray[inputarray.length-1]);

    }

    public static void main(String[] args) {

        Integer[] intarray = {2,5,4,6,8,9,10} ;

        Character[] chararray = {'a','b','d','u','t' ,'f'}  ;

        Float[] floatarray = {2.5f, 5.6f, 6.9f , 10.4f , 6.9f} ;

        new PrintMaxUsingStdOut(intarray).printMax();

        new PrintMaxUsingStdOut(chararray).printMax();

        new PrintMaxUsingStdOut(floatarray).printMax();

    }
}

