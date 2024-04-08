

package InputAccept;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Demo10{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three number");

        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();


        System.out.println((num1 > num2 && num1 > num3)  ? num1 : (num2 > num1 && num2 > num3 ? num2 : num3));


    }
}