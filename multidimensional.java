package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        123
        456
        789
         */
       // int[][] arr=new int[3][3];
       /* int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }*/
       // int[][] arr=new int[3][];//this is why u dont have to or mandatorily mention columns in arr declaration
//        int[][] arr={
//                {1,2,3},//0th index
//                {4,5,},//1st index
//                {6,7,8,9}//2nd index->arr[2]={6,7,8,9}
//        };
        int[][] arr=new int[3][3];
        System.out.println(arr.length);//no.of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
           for (int col=0;col<arr[row].length;col++){
               arr[row][col]=sc.nextInt();
           }

        }
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//           for (int col=0;col<arr[row].length;col++){
//               System.out.print(arr[row][col]+" ");
//           }
//            System.out.println();
//
//        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //System.out.println(Arrays.toString(arr[row]));
        for (int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
