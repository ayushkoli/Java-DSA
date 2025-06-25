package org.example;

import java.util.Scanner;

public class threedigit_Amstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("till what number you want to check amstrong numbers:");
        int number=s.nextInt();
        int count=0;
        for(int i=100;i<=number;i++){
            if(amstrong(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("there are total "+count+" Amstrong numbers between 100 and "+number);



    }
    static boolean amstrong(int n){
        int temp=n;
        int astr=0;
        while(n>0){
            int rem=n%10;
            astr=astr+(rem*rem*rem);
            n/=10;

        }
        if(temp==astr){
            return true;
        }
        return false;

    }
}
