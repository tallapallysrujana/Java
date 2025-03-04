//package com.kunal;
//
//import java.util.Scanner;
//
//public class avg {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        double sum=0,count=0;
//        double num;
//        System.out.println("Enter numbers to calculate the average: ");
//        while(true){
//            num=sc.nextDouble();
//            sum+=num;
//            count++;
//        }
//        if(count==0){
//            System.out.println("No numbers were enetered");
//
//        }
//        else {
//            double average=sum/count;
//            System.out.println("the avg is: "+average);
//        }
//
//    }
//}

package com.kunal;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0; // Use int for count since it represents the number of entries
        double num;

        System.out.println("Enter numbers to calculate the average. Enter 0 to finish:");

        while (true) {
            num = sc.nextDouble();
            if (num == 0) {
                break; // Exit the loop if the sentinel value is entered
            }
            sum += num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double average = sum / count;
            System.out.println("The average is: " + average);
        }

        sc.close(); // Close the scanner
    }
}


//Calculate Discount Of Product
//import java.util.Scanner;

//public class avg{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt user for the original price
//        System.out.println("Enter the original price of the product:");
//        double originalPrice = scanner.nextDouble();
//
//        // Prompt user for the discount rate
//        System.out.println("Enter the discount rate (in percentage):");
//        double discountRate = scanner.nextDouble();
//
//        // Validate the inputs
//        if (originalPrice < 0 || discountRate < 0) {
//            System.out.println("Price and discount rate must be non-negative.");
//        } else {
//            // Calculate the discount amount
//            double discountAmount = (discountRate / 100) * originalPrice;
//
//            // Calculate the final price after discount
//            double finalPrice = originalPrice - discountAmount;
//
//            // Print the results
//            System.out.printf("The original price: $%.2f%n", originalPrice);
//            System.out.printf("Discount amount: $%.2f%n", discountAmount);
//            System.out.printf("Final price after discount: $%.2f%n", finalPrice);
//        }
//
//        scanner.close();
//    }
//}


//distance between 2 points
/*input x1,y1,x2,y2
dist=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
to format the output
System.out.printf(" %.2f%n")
include z for 3d
      */
/*
commision program
commissionPercentage = (commissionAmount / salesAmount) * 100
 */


/*
import java.util.Scanner;

public class PowerCalculatorLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for base and exponent
        System.out.println("Enter the base:");
        double base = scanner.nextDouble();

        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt(); // Use int for the exponent

        // Validate exponent
        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
        } else {
            double result = 1;

            // Calculate power using a loop
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }

            // Print the result
            System.out.printf("The result of %.2f raised to the power of %d is: %.2f%n", base, exponent, result);
        }

        scanner.close();
    }
}

 */

/*
double result = power(base, exponent);
format
System.out.printf("The result of %.2f raised to the power of %d is: %.2f%n", base, exponent, result);
  for (int i = 0; i < exponent; i++) {
                result *= base;

      double result = Math.pow(base, exponent);
 */
/*
double depreciationExpense = (initialCost - salvageValue) / usefulLife;
Depreciation Expense=Book Value at Beginning of Year×Depreciation Rate
 */

/*
Calculate Batting Average
import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for total runs scored and total times out
        System.out.println("Enter the total runs scored:");
        double totalRuns = scanner.nextDouble();

        System.out.println("Enter the total times out:");
        int totalTimesOut = scanner.nextInt();

        // Validate inputs
        if (totalTimesOut < 0) {
            System.out.println("Total times out cannot be negative.");
        } else if (totalTimesOut == 0) {
            if (totalRuns == 0) {
                System.out.println("Batting average cannot be calculated (no data).");
            } else {
                System.out.println("Batting average is infinite (player has not been out yet).");
            }
        } else {
            // Calculate batting average
            double battingAverage = totalRuns / totalTimesOut;

            // Print the batting average
            System.out.printf("The batting average is: %.2f%n", battingAverage);
        }

        scanner.close();
    }
}

 */

/*
Calculate CGPA Java Program
import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of courses
        System.out.println("Enter the number of courses:");
        int numCourses = scanner.nextInt();

        // Variables to hold total credits and total grade points
        double totalCredits = 0;
        double totalGradePoints = 0;

        // Loop to get credits and grade points for each course
        for (int i = 1; i <= numCourses; i++) {
            System.out.println("Enter the credits for course " + i + ":");
            double credits = scanner.nextDouble();

            System.out.println("Enter the grade points for course " + i + ":");
            double gradePoints = scanner.nextDouble();

            // Validate inputs
            if (credits < 0 || gradePoints < 0) {
                System.out.println("Credits and grade points must be non-negative.");
                return; // Exit if invalid input is detected
            }

            totalCredits += credits;
            totalGradePoints += gradePoints * credits;
        }

        // Validate if total credits are greater than zero
        if (totalCredits == 0) {
            System.out.println("Total credits must be greater than zero.");
        } else {
            // Calculate CGPA
            double cgpa = totalGradePoints / totalCredits;

            // Print the CGPA
            System.out.printf("The CGPA is: %.2f%n", cgpa);
        }

        scanner.close();
    }
}

 */
/*
import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of subjects
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        // Validate the number of subjects
        if (numSubjects <= 0) {
            System.out.println("Number of subjects must be greater than zero.");
            return;
        }

        // Variables to hold the sum of marks
        double totalMarks = 0;

        // Loop to get marks for each subject
        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("Enter the marks for subject " + i + ":");
            double marks = scanner.nextDouble();

            // Validate the marks
            if (marks < 0) {
                System.out.println("Marks cannot be negative. Please enter a valid mark.");
                return; // Exit if invalid input is detected
            }

            totalMarks += marks;
        }

        // Calculate the average marks
        double averageMarks = totalMarks / numSubjects;

        // Print the average marks
        System.out.printf("The average marks are: %.2f%n", averageMarks);

        scanner.close();
    }
}

 */


/*
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of values
        System.out.println("Enter the number of values you want to sum:");
        int n = scanner.nextInt();

        // Validate the number of values
        if (n <= 0) {
            System.out.println("The number of values must be greater than zero.");
            return;
        }

        // Initialize the sum variable
        double sum = 0;

        // Loop to get input values and compute the sum
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            double number = scanner.nextDouble();

            // Add the number to the sum
            sum += number;
        }

        // Print the total sum
        System.out.printf("The sum of the %d numbers is: %.2f%n", n, sum);

        scanner.close();
    }
}

 */


/*
Armstrong Number In Java
import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int number = scanner.nextInt();

        // Calculate if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        // Calculate the sum of each digit raised to the power of the number of digits
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}

 */


/*
import java.util.Scanner;

public class CombinationsAndPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for n and r
        System.out.println("Enter the value of n (total items):");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r (items to choose/arrange):");
        int r = scanner.nextInt();

        // Validate inputs
        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid input. Ensure n >= r >= 0.");
            return;
        }

        // Calculate and display combinations and permutations
        long combinations = calculateCombinations(n, r);
        long permutations = calculatePermutations(n, r);

        System.out.printf("C(%d, %d) = %d%n", n, r, combinations);
        System.out.printf("P(%d, %d) = %d%n", n, r, permutations);

        scanner.close();
    }

    // Method to calculate combinations
    public static long calculateCombinations(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate permutations
    public static long calculatePermutations(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    // Method to calculate factorial
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

 */
/*
Find if a number is palindrome or not
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number to check if it is a palindrome:");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Check if the reversed number is the same as the original number
        return reversedNumber == originalNumber;
    }
}

 */

/*
Future Investment Value
import java.util.Scanner;

public class FutureInvestmentValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the principal amount (initial investment):");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in percentage):");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the number of times the interest is compounded per year:");
        int timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years the money is invested:");
        int years = scanner.nextInt();

        // Convert annual interest rate from percentage to decimal
        double rate = annualInterestRate / 100;

        // Calculate the future value
        double futureValue = calculateFutureValue(principal, rate, timesCompounded, years);

        // Print the result
        System.out.printf("The future value of the investment is: %.2f%n", futureValue);

        scanner.close();
    }

    // Method to calculate future value
    public static double calculateFutureValue(double principal, double rate, int timesCompounded, int years) {
        return principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
    }
}

 */


/*
import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Calculate HCF
        int hcf = findHCF(num1, num2);

        // Print the result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    // Method to find HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        // Ensure a >= b
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Implement Euclidean algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}

 */

/*
LCM Of Two Numbers
import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Calculate HCF
        int hcf = findHCF(num1, num2);

        // Calculate LCM
        int lcm = (num1 * num2) / hcf;

        // Print the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    // Method to find HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        // Ensure a >= b
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Implement Euclidean algorithm
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }
}

 */

/*
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a single character:");
        char ch = scanner.next().charAt(0);

        // Check if the character is a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input. Please enter a letter.");
        } else {
            // Convert character to lowercase for easier comparison
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }

        scanner.close();
    }
}

 */

/*
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a single character:");
        char ch = scanner.next().charAt(0);

        // Convert character to lowercase for easier comparison
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter a letter.");
        }

        scanner.close();
    }
}

 */

/*
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number to check if it is a perfect number:");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than 2 are not perfect numbers
        }

        int sum = 0;

        // Find all divisors of the number and sum them up
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == num;
    }
}


 */
/*
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a number to find the sum of its digits:");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Print the result
        System.out.println("The sum of the digits of " + number + " is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of digits
    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        // Handle negative numbers by converting to positive
        num = Math.abs(num);

        // Calculate the sum of digits
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }

        return sum;
    }
}

 */
