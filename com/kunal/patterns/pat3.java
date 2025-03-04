package com.kunal.patterns;

public class pat3 {
    public static void main(String[] args) {
        pattern3(5);
    }
    static void pattern3(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n-r+1;c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
