package com.kunal;
import java.util.Scanner;
public class inrtousd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double inr=sc.nextDouble();
        double usd;
        usd=inr*0.012;
        System.out.println("usd is %.2f%n "+usd);


    }
}
