package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(67);
//        list.add(64);
//        list.add(74);
//        list.add(78);
//        list.add(78);
//        list.add(64);
//        list.add(74);
//        list.add(78);
//        list.add(78);
//        list.add(64);
//
//        list.add(0,62);
//        list.remove(2);



//        System.out.println(list);
//        System.out.println(list.contains(62));
//        list.set(0,99);
//        System.out.println(list);
        //input
        //get item at any index
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(list.get(i));//pass index here ,lis[index] wont work in arraylists
        }
        System.out.println(list);

    }
}
