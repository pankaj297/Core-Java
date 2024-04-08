

package ControlStatements.LoopingStatements.doWhile;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            char ch;
            do{
                System.out.println("Enter the Character");
                ch = scan.next().charAt(0);
                System.out.println("You have entered : " + ch);
            }while(ch != 'x');

    }
}