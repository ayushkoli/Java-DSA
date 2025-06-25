package Basics;

public class countprime {

    public static void main(String[] args) {
        int result= countPrimes(5000000);
        System.out.println(result);

    }
    public static int countPrimes(int n) {
        int count=0;

        if(n<=1){
            return count;
        }
        for(int i=2;i<n;i++){

            int c=2;
            while(c*c<=i){
                if(i%c==0){
                    break;
                }
                c++;

            }
            if(c*c>i){
                count++;
            }

        }
        return count;
    }
}
