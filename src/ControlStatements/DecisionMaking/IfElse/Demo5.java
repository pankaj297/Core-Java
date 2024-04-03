
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");

        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +  " is max ");
        }
        if(num2  > num1 && num2 > num3){
            System.out.println(num2 + " is max ");
        }
        if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is max ");
        }

    }
}