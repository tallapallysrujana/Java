package com.kunal.patterns;

public class pat1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for(int r=1;r<=n;r++){
            //for every row,run the col
            for(int c=1;c<=r;c++){
                System.out.print("  "+c);
            }
            //when one line has been printed we need to add a new line
            System.out.println(" ");
        }
    }
}
