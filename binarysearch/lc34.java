package binarysearch;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//fb coding interview question
//first and last index of target
public class lc34 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        //when ans not found return -1,-1
        int[] ans={-1,-1};
        //check for first occurence of target
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        /*
            int ams[0]=search(nums,target,true);
            if(ans[0]!=-1){
             ans[1]=search(nums,target,false);
                }
        return ans;
         */
    }
    //this function just returns the index valuie of the target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            //find middle element
            //int mid=(start+end)/2;//might be possible that (start + end) exceeds range of integers in java
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else {//target=mid
                //potential ans found
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }//when element doesnt exist
        return ans;
    }
}
