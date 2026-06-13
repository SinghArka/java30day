/* Day Two of Thirty of Learning Java */
package com.learning;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        
        System.out.println("\n--- Weather Information ---");
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.println("\n--- Weather Conditions ---");
        
        if (celsius >= 25) {
            System.out.println("Conditions: It's hot!");
        } else if (celsius >= 15) {
            System.out.println("Conditions: It's mild.");
        } else {
            System.out.println("Conditions: It's cold!");
        }
        
        scanner.close();
    }
}