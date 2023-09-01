/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentnames;
import java.util.*;

/**
 *
 * @author Albert
 */
public class sorter extends StudentNames{
    String[] array;
    String name;
    
    public sorter (String[] array){
        String[] nameCollection = studentNameCollections(array);
        mySorter(nameCollection);
    }
    
    private String[] studentNameCollections(String[] array){
        return this.array = array;
    }
    private void mySorter(String[] array){
        Arrays.sort(array);
        System.out.println("\nThe sorted Array: ");
        for(String names : array)
            System.out.println(names);
        
    }
}
