package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("the maximum number is: "+ max);
    }
}