


package InputAccept;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Demo11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = scan.nextInt();

        boolean isLeapYear  = year % 400 == 0 || (year % 4 == 0 && year % 100  != 0);
        System.out.println(isLeapYear ? "its leap year " : "note leap year" );

    }
}