package binarysearch;

public class floor {
        public static void main(String[] args) {
            int[] arr={2,3,5,9,14,16,18};
            int target=1;
            int ans=floor(arr,target);
            System.out.println(ans);
        }
        //return the index: greatest number <= target
        static int floor(int[] arr,int target){

           //any number less than the smallest number in the array doesnt exist
           //like when target is 1 let be
            if(target<arr[0]){
                return -1;
            }
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                //find middle element
                //int mid=(start+end)/2;//might be possible that (start + end) exceeds range of integers in java
                int mid=start+(end-start)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }else if(target>arr[mid]){
                    start=mid+1;
                }else {//target=mid
                    return mid;
                }
            }//when element doesnt exist
            return end;
        }
    }
