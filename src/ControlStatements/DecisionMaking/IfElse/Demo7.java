
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {

        //accept length and breath and check if it is square
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        int length = scan.nextInt();
        int breadth = scan.nextInt();

        if(length == breadth){
            System.out.println("its a Square");
        }else {
            System.out.println("its not a Square");
        }


    }
}