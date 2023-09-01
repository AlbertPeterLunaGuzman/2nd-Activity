/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentnames;

import java.util.Scanner;

/**
 *
 * @author Albert
 */
public class searcher extends StudentNames{
    String[] array;
    String name;
    
    public searcher(String[] array, String name){
        String lookForThisName = nameToBeSearched(name);
        String[] arrayToBeSearched  = searchInArray(array);
        strSearch(arrayToBeSearched, lookForThisName);
    }
    private String[] searchInArray(String[] array){
        return this.array = array;
    }
    private String nameToBeSearched(String name){
        return this.name = name;
    }
    private static void strSearch(String[] array, String name){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(name)){
                index = i;
                break;
            } 
        }
        if(index != -1){ System.out.println("The index of the name is: " + index);} 
        else { System.out.println("Name not found"); }
    }
}
