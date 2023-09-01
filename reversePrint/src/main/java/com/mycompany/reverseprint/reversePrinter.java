/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reverseprint;

/**
 *
 * @author Albert
 */
public class reversePrinter {
    
    int[] array;

    public reversePrinter(int[] array) {
        this.array = array;
        printArrayInReverse(this.array);
    }
    private void printArrayInReverse(int[] array) {
        System.out.println("\nThe reversed array is: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
