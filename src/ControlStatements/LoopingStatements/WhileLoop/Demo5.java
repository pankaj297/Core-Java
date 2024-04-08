
package ControlStatements.LoopingStatements.WhileLoop;

public class Demo5 {
    public static void main(String[] args) {

     int slow = 1552019;
     int fast = 1552019;

//        System.out.println( slow + fast);

//        3104038

     while (slow <= fast){
         System.out.println(slow + "\t" + fast);
         slow++;
         fast = fast + 2;
     }
    }
}