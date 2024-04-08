
package ControlStatements.LoopingStatements.ForLoops;

public class Demo20 {
    public static void main(String[] args) {
      int num = 6;
      int factorial = 1;
      for(int i = 1; i <= num; i++){
          factorial *= i;
//          factorial = factorial * i;
      }
        System.out.println("Factorialis "+ factorial);
    }
}