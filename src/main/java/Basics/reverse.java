package Basics;

public class reverse {
    public static void main(String[] args) {
        int n=22343;
        int rev=0;

        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;

            n/=10;
        }
        System.out.println(rev);
    }
}
