
package ControlStatements.DecisionMaking.Switch;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Enter the operators");

        char operators = scanner.next().charAt(0);

        switch (operators){
            case '+' -> System.out.println("Addition is " + (num1 + num2));
            case '-' -> System.out.println("Sub is " + (num1 - num2));
            case '*' -> System.out.println("Multi is " + (num1 * num2) );
            case '/' -> System.out.println("Division Q is " + (num1 / num2));
            case '%' -> System.out.println("Division reminder is " + (num1 % num2));
            default -> System.out.println("Invalid operators");
        }
    }
}
