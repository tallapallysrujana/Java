package com.kunal.patterns;

public class pat28k {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for(int i=n-1;i>=1;i++){

        }
    }
}
