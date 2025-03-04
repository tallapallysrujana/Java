package Arrays;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        //create array
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;//modifying the object if you make changes to the object via ref var,same obj will be changed
        //0th index value in array will change to 99
    }
}
