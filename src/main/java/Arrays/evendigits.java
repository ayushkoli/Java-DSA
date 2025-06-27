package Arrays;

public class evendigits {
    public static void main(String[] args) {
        int[] a={12,345,55,3333};
        System.out.println(findNumbers(a));

    }
    public static int findNumbers(int[] nums) {
        int count=0;
        int digit=0;
        for (int i = 0; i <nums.length ; i++) {
            while (nums[i]>0){

                nums[i]/=10;
                digit++;

            }
            if(digit%2==0){
                count++;
            }
            digit=0;

        }
        return count;

    }
}
