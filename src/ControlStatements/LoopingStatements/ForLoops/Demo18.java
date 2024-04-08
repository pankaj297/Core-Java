
package ControlStatements.LoopingStatements.ForLoops;

public class Demo18 {
    public static void main(String[] args) {
      int num = 14;
      int sum = 0;

        System.out.println("Factor of " + num + " are");
        for(int i = 1; i <= num /2 ; i++){
            if(num % i == 0){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("Sum of factors is " + sum);
        System.out.println(sum == num ? "Perfect " : "not a perfect ");
    }
}