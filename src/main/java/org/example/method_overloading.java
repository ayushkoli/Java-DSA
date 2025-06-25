package org.example;

public class method_overloading {
    public static void main(String[] args) {
        int result=add(3,5);
        System.out.println("the result is : " +result);
        print(2);
        print("ayush");

    }
    /*✅ Method Overloading (in Java):
Method overloading means creating multiple methods with the same name
but with different parameters (number, type, or order of parameters) in the same class.

 */
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y;
    }
    static void print(int x){
        System.out.println(x);
    }
    static void print(String x){
        System.out.println(x);
    }
}
