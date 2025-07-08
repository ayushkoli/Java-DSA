package Arrays;

import java.util.Arrays;

public class sortedornot {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));

    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while (i<j) {
            int area = Math.min(height[i], height[j]) * (j - i);
            if(area>max){
                max=area;
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }

        }
        return max;

    }


    }


