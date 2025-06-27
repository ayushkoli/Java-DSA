package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.print("what do you want to search:");
        int target=s.nextInt();
        int result=search(arr,target);
        System.out.println(target+" is on the index: "+result);

    }
    public static int search(int[] array,int target){
        if(array.length==0){
            return -1;
        }
        for (int index = 0; index < array.length; index++) {
            if(array[index]==target){
                return index;
            }

        }
        return -1;

    }


}

