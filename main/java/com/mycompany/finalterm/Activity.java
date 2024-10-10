package com.mycompany.finalterm;

import java.util.Scanner;
public class Activity {
 
	public static void main(String[] args) {
        char [][] array = new char [3][4];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array [i][j] = " * ");
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}