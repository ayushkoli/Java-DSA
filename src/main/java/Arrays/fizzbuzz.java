package Arrays;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz {


    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));


    }
    public static List<String> fizzBuzz( int n) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("fizzbuzz");
            } else if (i%3==0) {
                list.add("Fizz");

            } else if (i%5==0) {
                list.add("Buzz");

            }else {
                list.add(String.valueOf(i));
            }
        }
        return list;

    }
}
