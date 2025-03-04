package com.kunal;
import java.util.Scanner;
public class lcmhcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1: ");
        int n1=sc.nextInt();
        System.out.println("num2: ");
        int n2=sc.nextInt();
        if(n1<=0 || n2<=0){
            System.out.println("enter positive numbers");

        }
       int hcf=hcfcal(n1,n2);
        int lcm=lcmcal(n1,n2,hcf);
        System.out.println("lcm is"+lcm);
        System.out.println("hcf is "+hcf);


    }
    public static int hcfcal(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return hcfcal(b, a % b);
        }
    }
    public static int lcmcal(int a,int b,int hcf){
        return Math.abs(a*b)/hcf;
    }
}
