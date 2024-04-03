package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("its is even number.." + num);
        }
        else {
            System.out.println("its an odd number.." + num);
        }
    }
}