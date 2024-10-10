package com.mycompany.finalterm;

import java.util.Scanner;
public class ActivityArray {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		double[] grades = new double[5];
		String[] subjects = {"Filipino","English","Science","Math","Programming"};
		
		System.out.println("Please enter the grade of the following subjects: ");
		for (int i = 0; i < subjects.length; i++) {
		double grade;
		do {
			System.out.print(subjects[i] + ": ");
			while (!scan.hasNextDouble()) {
				System.out.println("Invalid Input!");
				scan.next();
			}
			grade = scan.nextDouble();
			if (grade < 0 || grade > 100) {
				System.out.println("Invalid number! please enter a different number!");
			}
		} while (grade < 0 || grade > 100);
		grades[i] = grade;
		}
		System.out.println("\nThe grades for the subjects are as follows: ");
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + ": " + grades[i]);
		}
		
		double gradesum = 0;
		for (int i = 0; i < subjects.length; i++) {
			gradesum += grades[i];
		}
		double average = gradesum / subjects.length;
		
		System.out.println("The average score of all subjects is : " + average);
		
		
		System.out.println("\nGrade Classification: ");
		for (int i = 0; i < grades.length; i++) {
			char gradeClassification;
			if (grades[i] >= 90 ) {
				gradeClassification = 'A';
			} else if (grades [i] >= 80) {
				gradeClassification = 'B';
			} else if (grades [i] >= 70) {
				gradeClassification = 'C';
			} else if (grades [i] >= 60) {
				gradeClassification = 'D';
			} else  {
				gradeClassification = 'E';
			}
			System.out.println(subjects [i] + ": " + grades [i] + "-> " + gradeClassification);
		}
	}
}