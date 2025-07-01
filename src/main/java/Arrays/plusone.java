package Arrays;

import java.util.Arrays;

public class plusone {
    public static void main(String[] args) {
        int[] a = {9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }else {
                digits[i]=0;
            }
        }
        int[] adddigit=new int[digits.length+1];
        adddigit[0]=1;
        return adddigit;

    }
}
