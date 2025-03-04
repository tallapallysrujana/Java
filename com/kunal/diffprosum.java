package com.kunal;

import java.util.Scanner;
public class diffprosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(product(n));
        System.out.println(sum(n));
        int diff=product(n)-sum(n);
        System.out.println("Result = "+diff);

    }
    public static int product(int num){
        int pro=1;
        while(num>0){
            int rem;
            rem=num%10;
            num=num/10;
            pro=pro*rem;
        }
        System.out.println("Product of digits = "+pro);

        return pro;
    }
    public static int sum(int num1){
        int sum=0;
        while(num1>0){
            int rem1;
            rem1=num1%10;
            num1=num1/10;
            sum=sum+rem1;
        }
        System.out.println("Sum of digits = "+sum);
return sum;
    }
}
