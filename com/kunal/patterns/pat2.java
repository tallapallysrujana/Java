package com.kunal.patterns;

public class pat2 {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n){
        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
