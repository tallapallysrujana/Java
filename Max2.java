package Arrays;

public class Max2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(maxrange(arr,1,3));

    }
    //work on edge cases here,like array being null
    static int maxrange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }

        int maxval=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }

        }
        return maxval;
    }
}
