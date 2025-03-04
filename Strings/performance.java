package Strings;

public class performance {
    public static void main(String[] args) {
        String series= "";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);//numbers converted into ascii
            System.out.println(ch);
            series=series+ch;//""+char or obj just like in previous will be ab so

        }
        System.out.println(series);//output will be abcdefghijklmnopqrstuvwxyz
        //O(N^2)
    }
}
