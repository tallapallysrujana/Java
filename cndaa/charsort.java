package cndaa;
import java.util.Arrays;
import java.util.Scanner;

public class charsort {
//    public static void sortChar(char[] chars){
//        Arrays.sort(chars);
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
        String s=sc.nextLine();
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        String sortedString=new String(chars);
        System.out.println("Sorted characters: "+sortedString);

    }
}
