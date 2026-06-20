/* Day Four of Thirty of Learning Java */
package com.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store grades
        // YOUR CODE HERE
        ArrayList<Double> grades = new ArrayList<>();

        // Ask user how many grades they want to enter
        System.out.print("How many grades do you want to enter? Enter here: ");
        // Read the number
        // YOUR CODE HERE
        int gradesNum = scanner.nextInt();

        for (int i = 0; i < gradesNum; i++) {
            System.out.print("What was Student #" + (i + 1) + "'s grade? Enter here: ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        System.out.println("\n--- All Grades ---");

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Student #" + (i + 1) + "'s grade was a " + grades.get(i) + ".");
        }

        System.out.println("\n--- Performance Info ---");

        double gradesSum = 0;
        for (int i = 0; i < gradesNum; i++) {
            gradesSum += grades.get(i);
        }

        double average = gradesSum / gradesNum;
        System.out.print("\nAverage: " + average);

        double highest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
        }
        System.out.println("\nHighest Grade: " + highest);

        double lowest = grades.get(0);

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }
        System.out.println("Lowest Grade: " + lowest);

        scanner.close();
    }
}