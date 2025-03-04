package Arrays;

import java.util.Arrays;

public class maxof2darray {
    public static void main(String[] args) {
        int[][] arr= {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };


        System.out.println(max(arr));

    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;

                }
            }

        }
        return max;

    }}
//    static int max(int[][] arr,int target){
//        int max=Integer.MIN_VALUE;//or arr[0][0]
//        for(int r=0;r<arr.length;r++){
//            for(int c=0;c<arr[r].length;c++){
//                if(arr[r][c]>max){
//                    max=arr[r][c];
//                }
//            }
//        }
//        return max;
//
//    }
