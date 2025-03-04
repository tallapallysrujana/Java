package Arrays;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr ={18, 12, -7, 3, 14, 28};
        //search for 3 in range of index[1,4]
        int target=3;
        int ans=linearSearch(arr,target,1,4);
        System.out.println(ans);
    }
        static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=start;index<=end;index++){
            //check for element at every index it is = traget
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        //this line will execute if none of the return statements above have cxecuted hence the target not found
        return -1;
    }


}
