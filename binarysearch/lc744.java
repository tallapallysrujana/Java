package binarysearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class lc744 {
    public static void main(String[] args) {

    }
     public char nextGreatestLetter(char[] letters, char target) {
        //letters wrap around
        //if target=='z' and letters ==['a','b'], the answer is 'a'
        //when there no element or char greater than the target then return the 0th index

         int start=0;
         int end=letters.length-1;
         while(start<=end){
             //find middle element
             //int mid=(start+end)/2;//might be possible that (start + end) exceeds range of integers in java
             int mid=start+(end-start)/2;
             if(target<letters[mid]){
                 end=mid-1;
             }else{
                 start=mid+1;
             }
         }//when element doesnt exist
         return letters[start % letters.length];
     }
    }
