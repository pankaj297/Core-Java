
package Operators.LogicalOperators;

public class LogicalOperator {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        System.out.println(num1 >  num2 && num1 > num3); // false
        System.out.println(num3 > num1 && num2 > num3); //false
        System.out.println(num3 > num1 && num3 > num2); // true
    }
}