/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author acena2028
 */
public class BooleanLeapYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instantiate Scanner Object
        Scanner scan = new Scanner(System.in);
        
        // Ask user for an integer value representing a year, assign it to an integer variable
        System.out.println("Check if a year is a leap year!\nWhat year would you like to check?");
        int year = scan.nextInt();
        
        // Instantiate boolean variable
        boolean isLeapYear = false;
        // Instantiate earliest year constant
        final int MIN_YEAR = 1582;
        // Instantiate results string constants
        final String affirm = "Your year is a leap year!";
        final String negate = "Your year is a common year!";
        final String invalid = "INVALID: Your year is before 1582--the Gregorian Calendar hasn't been introduced yet!";
        
        // Check if the year inputted is a leap year
        // Check if year is after 1582
        if(year >= MIN_YEAR) {
            // Check if year is NOT divisible by 100
            if((year % 100) != 0) {
                // Check if year is divisible by 4
                if((year % 4) == 0) {
                    isLeapYear = true;
                    System.out.println("\n" + affirm);
                } else {
                    isLeapYear = false;
                    System.out.println("\n" + negate);
                }
            // If divisible by 100, check if year is divisible by 400
            } else {
                if((year % 400) == 0) {
                    isLeapYear = true;
                    System.out.println("\n" + affirm);
                } else {
                    isLeapYear = false;
                    System.out.println("\n" + negate);
                }
            }
        } else {
            System.out.println("\n" + invalid);
        }
    }
}