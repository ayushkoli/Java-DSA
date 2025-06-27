package Algorithm;

public class minmax {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,-9};
        minmax(arr);
    }
    public static void minmax(int[] array){
        int min=array[0];
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }

        }
        System.out.println("the max value is: "+max);
        System.out.println("the min value is: "+min);
    }
}
