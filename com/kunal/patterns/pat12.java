package com.kunal.patterns;

public class pat12 {
    public static void main(String[] args) {
        pattern12(5);

    }
    static void pattern12(int n){
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            if(i!=n) {
                for (int j = 1; j <= 2 * (n - i); j++) {

                    System.out.print(" ");
                }
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
