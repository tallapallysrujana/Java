package cndaa;

import java.util.*;

public class bytestuffing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the data: ");
        String s1=sc.nextLine();
        String s2=s1.replace("esc","escesc");
        String s3=s2.replace("flag","esc");
        String s4="flag"+s3+"flag";
        System.out.println(s4);
    }
}
