package ControlStatements.LoopingStatements.ForLoops;

public class Demo17 {
    public static void main(String[] args) {
       int num = 28;
       int sum = 0;
        System.out.println("Factor of " + num + " are");
        for(int i = 1; i <= num / 2; i++){
            if(num % i == 0){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("sum of factors is " + sum);
    }
}