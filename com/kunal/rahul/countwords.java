package com.kunal.rahul;



public class countwords {
    public static void main(String[] args) {


        String words = "one two three four";
        int countwords = words.split("\\s").length;

        System.out.println("no.of words : " + countwords);


    }
}
