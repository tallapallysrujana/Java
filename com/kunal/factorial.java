package com.kunal;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Factorial is not defined for a negative number.");
        }
        else{
            long fact=1;
            for(int i=n;i>0;i--){//for(int i=1;i<=n;i++)
                fact*=i;
            }
            System.out.println("factorial of "+n+"is: "+fact);
        }
    }
}
