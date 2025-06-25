package Basics;

public class countingoccurance {
    public static void main(String[] args) {
        long n=22343333324L;
        int count=0;
        while(n>0){
            long rem=n%10;
            if(rem==3){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
