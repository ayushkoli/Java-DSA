package Arrays;

public class noofpair {
    public static void main(String[] args) {
        int[] a={1,1,1,1};
        System.out.println(numIdenticalPairs(a));

    }
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }

            }

        }
        return count;

    }
}
