package binarysearch;
import java.util.*;
public class infiniteARRAY {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,11,15,17,18,19,20,21,31};
        int target=15;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        //find the range
        //first start with a box of size 2
        int start=0;
        int end=1;
        //condition for the targetto lie in the range
        while(target>arr[end]){
            int temp=end+1;//this is new start
            //double the box size
            //end=previousend+size ofbox*2
            //size ofbox=end-start+1
            end=end+(end-start+1)*2;
            start=temp;

        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
