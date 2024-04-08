package ControlStatements.LoopingStatements.ForLoops;

public class Demo21 {
    public static void main(String[] args) {

        int num  = 6;
        int fact = 1;
        for(int i = 6; i >= 1; i--){
            fact *= i;
//            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
    }
}