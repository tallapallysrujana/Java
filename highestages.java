package Arrays;
import java.util.Arrays;
public class highestages {
    public static void main(String[] args) {
        int[] age={20,23,28,29,35,26};
        int highest=age[0];
        int length=age.length;
        for(int i:age){
            if(highest<i){
                highest=i;
            }
        }
        System.out.println("highest: "+highest);
    }
}
