package Arrays;

import java.util.ArrayList
import java.util.Collection;
import java.util.Collections;

public class addarrayformofinteger {
    public static void main(String[] args) {
        int[] a={1,2,0,0};
        System.out.println(addToArrayForm(a,34));

    }
    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>(num.length);
        while (k>0){
            list.add(k%10);
            k/=10;
        }

        Collections.reverse(list);
        for (int i = num.length-1; i >=0; i--) {
            if(num[i]+ list.get(i)>=10){
                list.set(i,(num[i] + list.get(i)) % 10);
//                list.add((num[i]+ list.get(i))%10);
                list.set(i-1, list.get(i-1) + 1);

            } else{
                list.add(num[i]+ list.get(i));

            }

        }
        return list;
    }

}
