
package InputAccept;

import java.util.Scanner;

public class Demo1 {
    //accept
    //except
    //expect
    //aspect

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of type byte");

        byte byteInput = scan.nextByte();
        System.out.println("Byte value entered is " + byteInput);

    }
}