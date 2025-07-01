package Arrays;
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.Arrays;

public class runningsumof1D_Array {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(a)));


    }
    public static int[] runningSum(int[] nums) {
        int[] answer= new int[nums.length];
        int add=0;
        for (int i = 0; i < nums.length; i++) {
            add=add+nums[i];
            answer[i]=add;



        }
        return answer;

    }
}
