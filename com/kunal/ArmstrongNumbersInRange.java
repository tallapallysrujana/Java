package com.kunal;

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("start number of range : ");
        int start=sc.nextInt();
        System.out.println("end number of range : ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(Armstrong(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean Armstrong(int num){
        int org=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;

        }
        if(sum==org){
            return true;
        }
        else{
            return false;
        }
    }
}

/*
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = (int) Math.log10(number) + 1; // Get the number of digits

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of number of digits
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber; // Check if the sum is equal to the original number
    }
}

 */
