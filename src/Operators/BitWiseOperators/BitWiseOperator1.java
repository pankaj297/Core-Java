
package Operators.BitWiseOperators;

public class BitWiseOperator1 {
    public static void main(String[] args) {
        System.out.println("BitWise AND Operators");
        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(false & true); //false
        System.out.println(false & false); //false

        System.out.println("BitWise OR Operators");
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false

        System.out.println("BitWise XOR Operators");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); //false
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // true
    }
}

