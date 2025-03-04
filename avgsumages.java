package Arrays;
import java.util.Arrays;
public class avgsumages {
    public static void main(String[] args) {
       int[] ages={20,23,28,29,35,26};
       float avg,sum=0;
//       for (int i=0;i<ages.length;i++){
//           sum+=age;
//       }
       for(int i:ages){//for each loop where for(type varname:arrayname){//block of code}
           sum+=i;//sum=sum+i
       }
       avg=(sum/ages.length);
        System.out.println("Sum of ages is: "+sum);
        System.out.println("Average of ages is: "+avg);




    }
}
