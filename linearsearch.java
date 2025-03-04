package Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums={ 23,45,67,89,9,-3,1,16,11,56};
        int target=9;
        //int ans=linearSearch(nums,target);
        //System.out.println(ans);
//        int ans2=linearSearch2(nums,target);
//        System.out.println(ans2);
        boolean ans3=linearSearch3(nums,target);
        System.out.println(ans3);

    }
    //search the target and return true or false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        //run a for loop
        for(int index=0;index<arr.length;index++){
            //check for element at every index it is = traget
            int element=arr[index];
            if(element==target){
                return true;
            }

        }
        //this line will execute if none of the return statements above have cxecuted hence the target not found
        //return Integer.MAX_VALUE;//since sometimes -1 might exist in the array and since constants can be written in uppercase
        return false;//simply return false
    }



    //search target and return element itself
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=0;index<arr.length;index++){
            //check for element at every index it is = traget
            int element=arr[index];
            if(element==target){
                return element;
            }

        }
        //this line will execute if none of the return statements above have cxecuted hence the target not found
        return -1;
    }


    //search in the array: return index
    //if found else return -1
//    static int linearSearch(int[] arr,int target){
//        if(arr.length==0){
//            return -1;
//        }
//        //run a for loop
//        for(int index=0;index<arr.length;index++){
//            //check for element at every index it is = traget
//            int element=arr[index];
//            if(element==target){
//                return index;
//            }
//
//        }
//        //this line will execute if none of the return statements above have cxecuted hence the target not found
//        return -1;
//    }
}
