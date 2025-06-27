package Arrays;

import java.util.Arrays;

public class swapelementarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        swap(arr,1,2);

    }
    public static void swap(int[] array,int index1,int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;

        System.out.println(Arrays.toString(array));

    }
}
