package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>(10);
//       list.add(22)
//       list.add(12);
//       list.add(222);
//       list.add(232);
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);


        //input
        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());

        }
        System.out.println(list);
        System.out.println(list.get(3)); //list[] will not work here

    }
}
