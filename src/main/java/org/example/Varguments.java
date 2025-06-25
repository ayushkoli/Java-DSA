package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Varguments {
    public static void main(String[] args) {
        ex1(1,2,3,4,5,66,6,6,33);
        ex2("ayush","Tanay","ansh","pinku");

    }
    static void ex1(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void ex2(String...v){
        for(int i=0;i<v.length;i++) System.out.println(v[i]);
    }
}
