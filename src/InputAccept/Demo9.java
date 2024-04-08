

package InputAccept;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Demo9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two number");

        long num1 = scan.nextLong();
        long num2 = scan.nextLong();

        System.out.println(num1 > num2 ? num1 : num2);


    }
}