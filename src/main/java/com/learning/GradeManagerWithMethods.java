package com.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeManagerWithMethods {
    @SuppressWarnings("ConvertToTryWithResources")
    
    public static ArrayList<Double> readGrades(int numGrades) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        for (int i = 0; i < numGrades; i++) {
            System.out.print("What was Student #" + (i + 1) + "'s grade? Enter here: ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }
        
        return grades;
    }
    
    public static void displayGrades(ArrayList<Double> grades) {
        System.out.println("\n--- All Grades ---");
        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Student #" + (i + 1) + "'s grade was a " + grades.get(i) + ".");
        }
    }
    
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
    
    public static double findHighest(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
        }
        return highest;
    }
    
    public static double findLowest(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
            }
        }
        return lowest;
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user how many grades
        System.out.print("How many grades do you want to enter? Enter here: ");
        int numGrades = scanner.nextInt();
        
        // Call readGrades method to get grades from user
        ArrayList<Double> grades = readGrades(numGrades);
        
        // Call displayGrades to show all grades
        displayGrades(grades);
        
        System.out.println("\n--- Performance Info ---");
        
        // Call calculateAverage and display result
        double average = calculateAverage(grades);
        System.out.println("Average: " + average);
        
        // Call findHighest and display result
        double highest = findHighest(grades);
        System.out.println("Highest Grade: " + highest);
        
        // Call findLowest and display result
        double lowest = findLowest(grades);
        System.out.println("Lowest Grade: " + lowest);
        
        scanner.close(); // Close Scanner
    }
}