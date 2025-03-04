package com.kunal;
import java.util.Scanner;
public class leap{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       leap(year);
       System.out.println(leap(year));

   }
   public static boolean leap(int year){
      if(year%4==0 && (year%100!=0 || year%400==0))
        return true;
      else
          return false;
   }
}
