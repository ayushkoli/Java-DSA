package Arrays;

import java.util.Arrays;

public class concatination {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(Arrays.toString(getConcatenation(a)));

    }
    public static int[] getConcatenation(int[] nums) {
        int[] answer=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            answer[i]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i+nums.length]=nums[i];


        }
        return answer;

    }
}
