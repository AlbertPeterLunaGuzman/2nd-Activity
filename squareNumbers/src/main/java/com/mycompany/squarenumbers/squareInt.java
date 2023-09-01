/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.squarenumbers;

/**
 *
 * @author Albert
 */
public class squareInt extends SquareNumbers{
    
    int[] array;
    int size;
    
    public squareInt(int[] intArray, int size){
        int myArraySize = arraySize(size);
        int[] myIntArray, squareArray;
            myIntArray = intArray(intArray);
            squareArray = squareInt(myIntArray, myArraySize);
        printIntArray(squareArray);
    }
    private int arraySize(int size){
        return this.size = size;
    }
    private int[] intArray(int[] array){
        return this.array = array;
    }
    private int[] squareInt(int[] array, int size) {
        int[] squaredArray = new int[size];
        for (int i = 0; i <= array.length - 1; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        return squaredArray;
    }
    private void printIntArray(int[] array) {
        System.out.println("\nThe Squared Elements of the array: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
