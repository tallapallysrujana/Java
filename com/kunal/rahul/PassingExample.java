package com.kunal.rahul;

public class PassingExample {
    public static void main(String[] args) {
        String name="Kunal Kushwaha";
        greet(name);
    }
    static void greet(String naam){
        System.out.println(naam);
    }
    static void changeName(String naam) {
        naam="Rahul Rana";//creating a new object
    }
}
