package com.kunal.patterns;

public class pat19 {
    public static void main(String[] args) {
        pattern19(5);
    }
    static void pattern19(int n){
        int ins=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<ins;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            ins+=2;
            System.out.println(" ");


        }
        ins=8;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //sapces
            for(int j=0;j<ins;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            ins-=2;
            System.out.println(" ");
        }
    }
}
