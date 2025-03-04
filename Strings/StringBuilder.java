package Strings;
import java.util.Arrays;
public class StringBuilder {
    public static void main(String[] args) {
//        StringBuilder builder=new StringBuilder();
//        for(int i=0;i<26;i++){
//            char ch=(char)('a'+i);
//            //builder.reverse append like that many functions are available
        String name="Kunal Kushwaha";
        System.out.println((name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("        kunal    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
