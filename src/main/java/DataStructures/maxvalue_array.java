package DataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;

public class maxvalue_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 44, 5, 6};

//        max(arr);
        maxinrange(arr,0,2);


    }
    public static void max(int[] array){
        int max=0;
        for(int x:array){
            if(x>max){
                max=x;
            }
        }
        System.out.println("The max value of this array is: "+max);
    }
    public static void maxinrange(int[] array,int index1,int index2){
        int max=array[0];  //can also set to 0
        for(int i=index1;i<=index2;i++){
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println("The max value of this array is: "+max);
    }

}
