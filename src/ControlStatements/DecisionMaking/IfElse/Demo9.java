
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {

        System.out.println("Enter the month number");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();

        if(month == 1){
            System.out.println("Jan");
        }
        if(month == 1){
            System.out.println("Jan");
        } if(month == 2){
            System.out.println("Feb");
        } if(month == 3){
            System.out.println("March");
        } if(month == 4){
            System.out.println("April");
        } if(month == 5){
            System.out.println("May");
        } if(month == 6){
            System.out.println("Jun");
        } if(month == 7){
            System.out.println("July");
        } if(month == 8){
            System.out.println("August");
        } if(month == 9){
            System.out.println("Sept");
        } if(month == 10){
            System.out.println("Oct");
        } if(month == 11){
            System.out.println("Nov");
        }
        if(month == 12){
            System.out.println("Dec");
        }
        if(month < 1 || month > 12){
            System.out.println("Invalid Month");
        }

    }
}