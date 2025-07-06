package Arrays;

public class missingno {
    public static void main(String[] args) {
        int[] a={0,1};
        System.out.println(missingNumber(a));

    }
    public static int missingNumber(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    count++;

                }
            }
            if(count==0){
                return i;
            }

        }
        return -1;

    }
}
