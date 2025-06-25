package Basics;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter name of a fruit:");
        String fruit=s.next();
        switch (fruit) {
            case "mango":
                System.out.println("king of fruits");
                break;
            case "apple":
                System.out.println("keeps doc away");
                break;
            case "orange":
                System.out.println("round fruit");
                break;
            case "grape":
                System.out.println("nigga fruit");
                break;
            default:
                System.out.println("invalid fruit");
                break;
        }
    }
}
