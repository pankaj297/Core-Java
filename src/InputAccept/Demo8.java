
package InputAccept;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Demo8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String of type value");
        String string = scan.next();
        char ch = string.charAt(0);

        System.out.println("You have entered string "+ string);
        System.out.println("You have entered a character"+ ch);



    }
}