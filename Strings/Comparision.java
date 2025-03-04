package Strings;
import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;
public class Comparision {
    public static void main(String[] args) {
        String a="Kunal";
        String b="Kunal";//created outside the pool but in heap
        //==
        System.out.println(a==b);//true when diff objects awith same values are created
        //here the values are checked and not the objects


        String name1=new String("Kunal");
        String name2=new String("Kunal");
        System.out.println(name1==name2);//false
        System.out.println(name1.equals(name2));//true
        //we cannot  access the characters like in arrays
        //for accessing string characters charAt(index)
        System.out.println(name1.charAt(0));
        System.out.println(Arrays.toString(new int[] {1,2,3,4,5,6}));
        //concatenation of strings
        System.out.println('a'+'b');//195
        System.out.println("a"+"b");//ab
        System.out.println('a'+3);//100
        System.out.println((char)('a'+3));//d into ascii //string will not be converted into ascii
        //integer will be converted into Integer that will call toString()
        System.out.println("Kunal"+new ArrayList<>());//Kunal[]
       // System.out.println("Kunal"+new Integer(56));
       // System.out.println(new Integer(56)+new ArrayList<>());+ wont work since any one must be string

    }
}
