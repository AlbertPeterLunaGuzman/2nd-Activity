/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentnames;

/**
 *
 * @author Albert
 */
public class arrayPrinter {
    String[] array;
    
    public arrayPrinter(String[] array){
        String[] myArray = strArray(array);
        printStrArray(myArray);
    }
    private String[] strArray(String[] array){
        return this.array = array;
    }
    private void printStrArray(String[] array){
        System.out.println("\nPrint Student names: ");
        for(String elements: array)
            System.out.println(elements);
    }
}
