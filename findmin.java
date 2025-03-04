package Arrays;

public class findmin {
    public static void main(String[] args) {
        int[] arr={18,21,3,45,65};
        System.out.println(min(arr));

    }
    //assuming that this is not an empty array/
    //return the minimum value in the array
    static int min(int[] arr){
       int ans=arr[0];
       for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){//for max>
                ans=arr[i];
            }
       }
       return ans;

    }
}
