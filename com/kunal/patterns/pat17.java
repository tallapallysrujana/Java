package com.kunal.patterns;

public class pat17 {
    public static void main(String[] args) {
        pattern17(5);
    }
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //characters
            char ch='A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint) ch++;
                else ch--;
            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
