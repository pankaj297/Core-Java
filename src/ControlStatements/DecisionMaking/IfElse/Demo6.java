
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three Number");

        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is max");
        }else if (num2 > num1 && num2 > num3){
            System.out.println(num2 + " is max");
        }else {
            System.out.println(num3 + " is max");
        }
    }
}