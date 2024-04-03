
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the salary and years of service");

        int salary = scan.nextInt();
        int yearsOfService = scan.nextInt();

        float bonus = 0.0f;

        if(yearsOfService >= 5){
            bonus = salary * 0.5f;

        }
        System.out.println("Your net bouns is " + bonus);
    }
}