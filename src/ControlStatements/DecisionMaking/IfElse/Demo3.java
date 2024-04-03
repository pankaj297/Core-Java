
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("its even number.." + num);
        }
        if(num % 2 != 0){
            System.out.println("its an odd number.." + num);
        }

    }
}


