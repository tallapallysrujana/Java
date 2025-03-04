package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
/*      array of primitives
        arr[0] = 23;
        arr[1] = 20;
        arr[2] = 22;
        arr[3] = 28;
        arr[4] = 29;
        //[23,20,22,28,29]
        System.out.println(arr[3]);
        //input using for loops
//        for(int i=0;i<5;i++){
//
//        }*/
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        for(int num: arr){//for every element in the array ,print the element
//            System.out.println(num+" ");//here num represents element of the array
//        }
//        System.out.println(arr[5]);//gives index out of bound error
        /*array of objects*/
        String[] str=new String[4];
        for (int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="sruj";
        System.out.println(Arrays.toString(str));

        String[] s1=new String[4];
        System.out.println(arr[0]);

        for (String ele:s1){
            System.out.println(ele);
        }
    }
}
