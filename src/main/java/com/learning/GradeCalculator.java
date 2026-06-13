/* Day Three of Thirty of Learning Java */
package com.learning;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many grades do you have? Enter here: ");
        int numGrades = scanner.nextInt();

        double sumGrades = 0;
        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("What was Student #" + (i + 1) +  "'s grade? Enter here: ");
            double grade = scanner.nextDouble();
            sumGrades += grade;
        }
       
        double averageGrades = sumGrades / numGrades;
        
        System.out.println("\n--- Grade Summary ---");
        System.out.println("Average: " + averageGrades);

        System.out.println("\n--- Class Average ---");
        if (averageGrades >= 90) {
            System.out.println("Class Average: A");
        } else if (averageGrades >= 80) {
            System.out.println("Class Average: B");
        } else if (averageGrades >= 70) {
            System.out.println("Class Average: C");
        } else if (averageGrades >= 60) {
            System.out.println("Class Average: D");
        } else if (numGrades <= 0) {
            System.out.println("No grades entered. Cannot calculate average.");
        } else {
            System.out.println("Class Average: F");
        }
        
        
        scanner.close();
    }
}