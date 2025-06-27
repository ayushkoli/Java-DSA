package Arrays;

import java.util.Arrays;

public class passing_array_in_function {
    public static void main(String[] args) {
        int[] array1={1,2,34,5};
        System.out.println(Arrays.toString(array1));
        change(array1);
        //☢️ arrays are mutable in java they can be changes as both refrences
        // arr and array1 pointed to same object in heap so if arr does any changes the
        // changes can be seen in array1 also.☢️

        //if we do same with string the original string will not change as strings are immutable in
        // java hence it creates a duplicate and do operations on that the original one will not be changed

        System.out.println(Arrays.toString(array1));

    }
    public static void change(int[] arr){
        arr[0]=99;
    }
}
