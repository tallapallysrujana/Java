package com.kunal;

import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        String reversed=reversestring(input);
        System.out.println("reversed String is:  "+reversed);


    }
    public static String reversestring(String str){
        String rev="";//declare empty string
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;

    }
}
