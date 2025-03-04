package bubblesort;
import java.util.*;

public class bubble {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubblesort(int[] nums){
        boolean swapped;
        int n=nums.length;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=1;j<=n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=true;

                }
            }
            if(swapped==false){//array is already sorted no need to go for next pass
                break;
            }
        }
    }
}
