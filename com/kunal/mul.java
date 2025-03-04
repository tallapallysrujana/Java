package com.kunal;
import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("num is: ");
        int num=sc.nextInt();
        for(int i=0;i<11;i++){
        System.out.println(num+" "+ " * "+i+" = "+(num*i));
        }
    }
}
