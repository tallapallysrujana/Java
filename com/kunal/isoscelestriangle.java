package com.kunal;

import java.util.Scanner;


public class isoscelestriangle {
    public static void main(String[] args) {
//two sides equal
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a & b: ");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        double h=Math.sqrt((a*a)-((b/2)*(b/2)));
        double area = 0.5*b*h;
        double perimeter = 2*a+b;
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
    }
}
