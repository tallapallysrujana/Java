package com.kunal;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        //greeting();
        System.out.println("hello, "+name +"!Welcome to our program.");
    }
//    static void greeting(String naam){
//        System.out.println("Hello World!");
//    }
}
