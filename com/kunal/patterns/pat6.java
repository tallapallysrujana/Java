package com.kunal.patterns;

public class pat6 {
    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        //spaces
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
