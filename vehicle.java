package Arrays;
import java.util.*;

public class vehicle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        int count2=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                count++;
            }
            else{
                count2++;
            }

        }
        int date=sc.nextInt();
        int x=sc.nextInt();
        if(date%2==0){
            System.out.println(x*count);
        }
        else{
            System.out.println(x*count2);
        }

    }

}
