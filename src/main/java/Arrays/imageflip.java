package Arrays;

import java.util.Arrays;

public class imageflip {
    public static void main(String[] args) {
        int[][] a={
                {1,1,0},
                {0,1,0},
                {1,1,1}
        };
        
        int[][] b=new int[a.length][];

        b=flipAndInvertImage(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));

        }


    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {

                image[i]=reverse(image[i]);
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][j]==0){
                    image[i][j]=1;
                }else{
                    image[i][j]=0;
                }

            }



        }
        return image;

    }

    public static int[] reverse(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            swap(array,start,end);
            start++;
            end--;
        }
        return array;
    }
    public static void swap(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;


    }
}
