package com.kunal.patterns;

public class pat7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");

        }

    }
}
