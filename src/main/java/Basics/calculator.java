package Basics;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter operator:");
        char operator=s.next().trim().charAt(0);
        double ans=0;
        if(operator=='+' || operator=='-' ||operator=='*' ||operator=='/'){
            System.out.println("enter two numbers");

            float a=s.nextFloat();
            float b=s.nextFloat();
            if(operator=='+'){
                ans=a+b;

            }if(operator=='-'){
                ans=a-b;

            }if(operator=='*'){
                ans=a*b;

            }if(operator=='/'){
                ans=a/b;

            }
            System.out.println(ans);
        }else{
            System.out.println("invalid operator!!");
        }

    }
}
