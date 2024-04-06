

package ControlStatements.DecisionMaking.Switch;

public class Demo1 {
    public static void main(String[] args) {

        int num = 2;

        switch (num){
            case 1:{
                System.out.println("One");
            }
            break;
            case 2: {
                System.out.println("Two");
            }
            break;
            case 3: {
                System.out.println("Three");
            }
            default:
            {
                System.out.println("Invalid input");
            }
            break;
        }
    }
}