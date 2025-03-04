package com.kunal;

import java.util.Scanner;


public class EvenDaysInAugust {
    public static void main(String[] args) {

        int totaldays=31;
        int count=0;//even
        for(int day=1;day<=totaldays;day++){
            //if day is even
            if(day%2==0){
                count++;
            }
        }
        System.out.println("Kunal can go out on "+count+ "evendays in August");


    }
    /*
    import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store the sums
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (enter 0 to finish):");

        while (true) {
            // Read input from the user
            int number = scanner.nextInt();

            // Terminate the loop if the user enters 0
            if (number == 0) {
                break;
            }

            // Calculate the sums based on the type of number
            if (number < 0) {
                sumNegative += number; // Sum of negative numbers
            } else if (number % 2 == 0) {
                sumPositiveEven += number; // Sum of positive even numbers
            } else {
                sumPositiveOdd += number; // Sum of positive odd numbers
            }
        }

        // Print the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        scanner.close();
    }
}

     */
}
