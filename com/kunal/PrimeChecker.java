
package com.kunal;

import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int n) {
        // Basic checks
        if (n < 2) return false;  // Not prime
        if (n == 2) return true;   // 2 is prime
        if (n % 2 == 0) return false; // Even numbers greater than 2 are not prime

        // Check odd numbers from 3 to sqrt(n)
        int i = 3;
        while (i * i <= n) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
            i += 2; // Increment by 2 to check only odd numbers
        }
        return true; // No divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime and print the result
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
