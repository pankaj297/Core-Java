package ControlStatements.LoopingStatements.ForLoops;

public class Demo22 {
    public static void main(String[] args) {

        for(int num = 1; num <= 100000; num++){
            int sumOfFactors = 0;
            for(int i = 1; i <= num / 2; i++){
                if(num % 1 == 0){
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if(sumOfFactors == num){
                System.out.println("Perfect num " + num);
            }
        }
    }
}