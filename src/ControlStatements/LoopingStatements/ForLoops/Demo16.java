
package ControlStatements.LoopingStatements.ForLoops;

public class Demo16 {
    public static void main(String[] args) {
        int num = 28;
        System.out.println("Factor of " + num + "are ..");
        for(int i = 1; i <= num / 2; i++){
            if(num % 1 == 0){
                System.out.println(i);
            }
        }
    }
}