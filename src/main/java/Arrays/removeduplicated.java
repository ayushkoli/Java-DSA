package Arrays;

import java.util.Arrays;

public class removeduplicated {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));



    }
    public static int trailingZeroes(int n) {
        long fact=1L;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;

        }
        int count=0;
        while (fact%10==0){
            count++;
            fact/=10;

        }
        return count;

    }

}
