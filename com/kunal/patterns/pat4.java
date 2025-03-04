package com.kunal.patterns;

public class pat4 {
    public static void main(String[] args) {
        pattern4(5);
    }
    static void pattern4(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=r;c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
