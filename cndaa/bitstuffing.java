package cndaa;
import java.util.*;



public class bitstuffing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data:");
        String data=sc.next();
        String s=" ";
        int c=0,i;
        for(i=0;i<data.length();i++){
            char ch=data.charAt(i);
            if(ch=='1'){
                c++;
                if(c<5){
                    s+=ch;
                }
                else{
                    s=s+ch+'0';
                    c=0;
                }
            }
            else{
                s+=ch;
                c=0;
            }
        }
        s="01111110"+s+"01111110";
        System.out.print(s);
    }
}
