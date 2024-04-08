
package InputAccept;

import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of type short");

        short nextInput = scan.nextShort();
        System.out.println("Short value entered is "+ nextInput);


    }
}