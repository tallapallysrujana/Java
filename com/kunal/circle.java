package com.kunal;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius: ");
        Double r=sc.nextDouble();
        Double area=3.14*r*r;
        Double perimeter=2*3.14*r;
        System.out.println("area: "+area);
        System.out.println("perimeter: "+perimeter);

    }
}
