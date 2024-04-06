
package ControlStatements.DecisionMaking.Switch;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter the Month number");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        switch (month){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Des");
                break;
            default:
                System.out.println("Invalid Month");
        }
    }
}