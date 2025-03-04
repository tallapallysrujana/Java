package Arrays;

import java.net.SocketOption;

public class arrays {
    public static void main(String[] args) {
        //store roll no.
        int a=19;

        //store name of person
        String name="Srujana";

        //5 roll no.s
        int r1=19;
        int r2=12;
        //syntax
        //datatype[] varname=new datatype [size];
        //stor 5 roll numbers
//        int[] rollno=new int[5];
//        //or directly as
//        int[] rollno1={12,13,14,15,16};
        int[] rnos;//declaration of array rnos is getting defined in the stack
        rnos=new int[5];//initialisation:actually here object is being created in heap memory
        System.out.println(rnos[1]);
        String[] arr=new String[4];
        System.out.println(arr[0]);
      //  String str=null;


    }
}
