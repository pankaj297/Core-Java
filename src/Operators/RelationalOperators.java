
package Operators;

public class RelationalOperators {
    public static void main(String[] args) {
//        System.out.println(4 > true); // CET i/p must be number
//        System.out.println(true > true); // CET i/p must be number
//        RelationalOperators  > , < , >= , <= , == , != , % .
        System.out.println(4 > 2); // true
        System.out.println(3 < 2); // false
        System.out.println(3 > 2); //  true
        System.out.println(4 < 2); // false
        System.out.println(3 < 2); // false
        System.out.println(3 <= 2); //false
        System.out.println(3 >= 2); // false
        System.out.println(3 == 3); // true
        System.out.println(3 == 2); //false
        System.out.println(3 != 2);// true
        System.out.println(2024 % 4 == 0); // true
        System.out.println(12 % 2 == 0); // true
        System.out.println(20 % 2 != 0); // false
        System.out.println(true == false); //false
        System.out.println(false == true); // false
        System.out.println(true == true); // true
        System.out.println(false == false); // true
        System.out.println(true != false); // true
        System.out.println(false != true); //  true
        System.out.println(true != true); // false
        System.out.println(false != false); // false
    }
}