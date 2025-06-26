package Basics;

public class adddigit {
    public static void main(String[] args) {
       int ans= addDigits(38);
        System.out.println(ans);
    }
    public static int addDigits(int num) {
        while(num>=10){
            int result=0;
            while (num>0){
                int rem=num%10;
                result+=rem;
                num/=10;
            }
            num=result;
        }
        return num;


    }
//        int result=0;
//        int count=0;

//        while (count>=0&&count<2){
//            while(num>0){
//               int rem=num%10;
//               result=result+rem;
//               num/=10;
//               count++;
//        }
//            num=result;
//            result=0;
//            if (count >= 2) {
//                count=0;
//            }else {
//                return num;
//            }
//        }
//        return num;
//
//    }
}
