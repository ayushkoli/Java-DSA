package Basics;

public class happynumber {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
    public static boolean isHappy(int n) {
        while(n>0){
            int result=0;
            int rem=n%10;
            result+=rem*rem;
            n/=10;
            if(result<10){
                if(result==1){
                    return true;
                }

            }
            n=result;

        }
        return false;

    }
}
