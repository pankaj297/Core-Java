
package ControlStatements.DecisionMaking.Switch;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Enter the Month number");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month) {
            case 1 -> System.out.println("Jan");

            case 2 -> System.out.println("Feb");

            case 3 -> System.out.println("March");

            case 4 -> System.out.println("April");

            case 5 -> System.out.println("May");

            case 6 -> System.out.println("Jun");

            case 7 -> System.out.println("July");

            case 8 -> System.out.println("August");

            case 9 -> System.out.println("Sept");

            case 10 -> System.out.println("Oct");

            case 11 -> System.out.println("Nov");

            case 12 -> System.out.println("Des");

            default -> System.out.println("Invalid Month");
        }
    }
}