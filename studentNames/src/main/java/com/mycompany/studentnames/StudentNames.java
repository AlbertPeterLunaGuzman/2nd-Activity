/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentnames;
/**
 *
 * @author Albert
 */
import java.util.Arrays;
import java.util.Scanner;
public class StudentNames {

    public static void main(String[] args) {
        StudentNames.callMe();
    }
    private static String [] strArray (){
        Scanner s = new Scanner(System.in);
        String [] names = new String [5];
        System.out.println("Enter Names: ");
            for(int i = 0; i < names.length; i++){
                names[i] = s.nextLine();
            }
        return names;
    }
    private static String searchName(){
        System.out.print("\nEnter name: ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        return name;
    }
    private static void callMe(){
        String[] studentNamesArray = StudentNames.strArray();
        String name = searchName();
        searcher mySearcher = new searcher(studentNamesArray, name);
        sorter mySorter = new sorter(studentNamesArray);
    }
}
