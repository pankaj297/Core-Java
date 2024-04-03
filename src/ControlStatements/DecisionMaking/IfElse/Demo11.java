
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year");

        int year = scan.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("This is leap year");
                }else {
                    System.out.println("This is not leap year");
                }
            }else {
                System.out.println("this is leap year");
            }
        }else {
            System.out.println("this is not leap year");
        }
    }
}