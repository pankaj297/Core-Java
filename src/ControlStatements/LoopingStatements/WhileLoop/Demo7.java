
package ControlStatements.LoopingStatements.WhileLoop;

public class Demo7 {
    public static void main(String[] args) {

        int left = 0;
        int right = 10;

        while (left < right){
            System.out.println(left + "\t" + right);
            right--;
        }
    }
}