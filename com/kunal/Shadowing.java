package com.kunal;

public class Shadowing {
    static int x=90;//can be accessed inside the class//this will be shadowed at 40
    public static void main(String[] args) {
        //functions blocks loops will have their own scopes also variables have thier own scope
        System.out.println(x);//90
        int x;//the class variable at line 4 shadowed by this
        //System.out.println(x);//gives an error since scope will begin when valued is initialised
        x=40;
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
