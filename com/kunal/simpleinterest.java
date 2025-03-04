package com.kunal;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("p:");
        double p=sc.nextDouble();
        System.out.println("t: ");
        double t=sc.nextDouble();
        System.out.println("r: ");
        double r=sc.nextDouble();
        double si,ci;
        si=(p*t*r)/100;
        System.out.println("simple interest is: "+si);
        double n=sc.nextDouble();
        ci=(p*Math.pow((1+(r/n)),n*t))-p;
        System.out.println(ci);

    }
}
