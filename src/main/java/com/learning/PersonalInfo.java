/* Day One of Thirty of Learning Java */
package com.learning;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.print("Enter your favorite color: ");        
        String color = scanner.nextLine();
        
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + color);
        
        scanner.close();
    }
}