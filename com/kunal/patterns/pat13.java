package com.kunal.patterns;

public class pat13 {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern13(int n){
        int start=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print(start+" ");
                start=start+1;

            }
            System.out.println(" ");
        }
    }
}
