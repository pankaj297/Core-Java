
package Operators.ConditionalOperators;

public class ConditionalOperators2 {
    public static void main(String[] args) {

        int num1 = 199;
        int num2 = 19888;
        int num3 = 99;
        System.out.println(num1 < num2 && num1 > num3 ? num1 : num2 > num1 && num2 > num3 ? num2 : num3);
    }
}
