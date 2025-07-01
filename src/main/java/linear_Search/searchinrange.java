package linear_Search;

import java.util.Arrays;
import java.util.Scanner;

public class searchinrange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.print("what do you want to search:");
        int target=s.nextInt();
        System.out.println("in what range you want to search:");
        int start=s.nextInt();
        int end=s.nextInt();
        int result=search(arr,target,start,end);
        System.out.println(target+" is on the index: "+result);

    }
    public static int search(int[] array,int target,int start,int end){
        if(array.length==0){
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if(array[index]==target){
                return index;
            }

        }
        return -1;

    }
}
