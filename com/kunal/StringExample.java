package com.kunal;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message=greet();
//        System.out.println(message);
        //this says that whatever greet takes also the message takes
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam= in.next();
        String personalised=myGreet(naam);
        //exactly pass the same type into arguments
        System.out.println(personalised);

    }
    static String myGreet(String name){
        String message= "Hello" + name;
        return message;
    }
    static String greet() {
        String greeting="How are you?";
        return greeting;
    }
    }
