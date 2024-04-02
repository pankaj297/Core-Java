
package Operators.LogicalOperators;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println("Logical AND");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

//        System.out.println(4 && 5);; //CET
        System.out.println(2024 % 400 == 0); // false
        System.out.println((2024 % 400 == 0) || (2024 % 100 != 0)); //true
        System.out.println((2024 % 400 == 0) || (2024 % 100 != 0 && 2024 % 4 == 0)); // true
        System.out.println((2023 % 400 == 0)  || (2023 % 100 != 0 && 2023 % 4 == 0)); // false
    }
}



