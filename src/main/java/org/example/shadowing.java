package org.example;

public class shadowing {
    static int x=20;
    public static void main(String[] args) {


            System.out.println(x);
             int x=33; //new x shadows the higher level scope x and i available in this class only
            System.out.println(x);

        print();
    }
    static void print(){
        System.out.println(x);
    }
}
