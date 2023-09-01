package com.mycompany.reverseprint;

import java.util.*;

public class ReversePrint {

    public static void main(String[] args) {
        int[] array = intArray();
        reversePrinter myReversePrinter = new reversePrinter(array);
    }

    private static int[] intArray() {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }
}
