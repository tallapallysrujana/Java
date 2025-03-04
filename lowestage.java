package Arrays;
import java.util.Arrays;
public class lowestage {
    public static void main(String[] args) {
        int[] ages={20,23,28,29,35,26};

        int lowest=ages[0];
        int length=ages.length;
        for(int i:ages){
            if(lowest >i){
                lowest=ages[i];
            }
        }
        System.out.println("lowest of the ages: "+lowest);
    }
}
