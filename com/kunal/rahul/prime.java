
package com.kunal.rahul;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");

        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }


    }
    public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        if(number==2){
            return true;
        }
        if(number%2==0){
            return false;
        }
        for(int i=3;i*i<=number;i=i+2){
            if(number%i==0){
                return false;
            }
        }
        return true;

    }
}
