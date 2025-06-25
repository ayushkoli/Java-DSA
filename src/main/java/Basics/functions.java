package Basics;

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
//        greet(2);
//        int result=sum();
//        System.out.println("The result is: "+result);

//        System.out.println(greet("ayush"));
        String name="ayush";
        changename(name);
        System.out.println(name);


    }

    static void changename(String name) {
        name="tanay";
        System.out.println(name);
    }


//    public static String greet(String name){
//        String greet="hello "+name;
//        return greet;
//
//    }
//    public static int sum(){
//        Scanner s=new Scanner(System.in);
//        System.out.print("enter number 1: ");
//        int a=s.nextInt();
//
//        System.out.print("enter number 2: ");
//        int b=s.nextInt();
//        int sum=a+b;
//        return sum; //return means function over nothing will execute after it
//    }

//    public static void greet(int n){
//        for(int i=1;i<=n;i++){
//            System.out.println("Hello World!");
//        }
//    }
}
