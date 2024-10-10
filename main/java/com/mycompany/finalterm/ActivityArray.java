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
		System.out.print("\nSubjects with grade below 75");
		for (int i = 0; i < subjects.length; i++) {
			if(grades [i] < 75){
				System.out.println(subjects[i] + " : " + grades[i]);
			}
		}
		double maxGrade = grades[0];
		double minGrade = grades[0];
		String maxSubject = subjects[0];
		String minSubject = subjects[0];

		for (int i = 1; i < grades.length; i++){
			if (grades[i] > maxGrade){
				maxGrade = grades[i];
				maxSubject = subjects[i];
			}
		}
		System.out.println("\nHighest grade: " + maxSubject + " : " + maxGrade);

        double maxGrades = grades[0];
		double minGrades = grades[0];
		String maxSubjects = subjects[0];
		String minSubjects = subjects[0];

		for (int i = 1; i < grades.length; i++){
			if (grades[i] < maxGrades){
				maxGrades = grades[i];
				maxSubjects = subjects[i];
			}
		}
		System.out.println("\nLowest grade: " + maxSubjects + " : " + maxGrades);
	}
}