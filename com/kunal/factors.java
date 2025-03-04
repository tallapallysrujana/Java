package com.kunal;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        factor(n);
        System.out.println();

    }
    public static void factor(int num){
        System.out.println("factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        System.out.println();//next line
    }
}
