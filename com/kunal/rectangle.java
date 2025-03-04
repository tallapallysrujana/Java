package com.kunal;

import java.util.Scanner;


public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter l & b: ");
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double area=l*b;
        double perimeter=2*(l+b);
        System.out.println("area: "+area);
        System.out.println("perimeter: "+perimeter);
    }
}
