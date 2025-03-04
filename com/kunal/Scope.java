package com.kunal;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //System.out.println(marks);
        //a can be accessed only in this function
        //from where we can access variables is known as scope
        String name="Kunal";
        {
            //int a=78;already initialised outside the block in the same metgod so cant initialise again but change
            // will give an error because a is already initialised so one
            // variable can be initialised only once and cant be changed like this if we want to change
            // it we can do it directly assigning a=78
            a=78;//reassign the original ref var to some other value
            System.out.println(a);
            name="rahul";
            int c=99;//values initialised in this block will remain in this block and cant be used outside the block
            //c here will have scope only in this block outside the block it wont even know that it has initialise c

        }
       // System.out.println(c);//an error beacuse in block scopecant use outside the block
        int c=900;
        System.out.println(a);
        System.out.println(name);
        //scoping in for loops
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
            a=8000;//num and i cant be used ouside the loop
        }
        //System.out.println(i);//i cant be accessed because initialised inside a block


    }
    static void random(int marks){
        int num=67;
        System.out.println(num);//num cant be accessed from main
        System.out.println(marks);//only variables can be accessed in thsi function

    }
}
