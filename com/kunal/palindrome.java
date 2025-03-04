package com.kunal;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input=sc.nextLine();
//        // Remove spaces and convert the string to lower case for uniform comparison
//        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        if(isPalindrome(input)){
            System.out.println(input+" "+"is a palindrome");

        }
        else{
            System.out.println(input+" "+"is not a palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
