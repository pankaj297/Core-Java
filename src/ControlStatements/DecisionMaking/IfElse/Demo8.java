
package ControlStatements.DecisionMaking.IfElse;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        //accept the quantity and price
        // 10000 >= 10%
        // 20000 >= 20%
        // 30000 >= 30%
        // 40000 >= 40%

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the product price and its quantity");

        int price = scan.nextInt();
        int quantity = scan.nextInt();

       float discount = 0.0f;

       float totalBill = price * quantity;

       if(totalBill >= 10000 && totalBill <= 20000){
           discount  = totalBill * 0.1f;
       }else if(totalBill > 20000 && totalBill <= 30000){
           discount  = totalBill * 0.2f;
       } else if (totalBill > 30000 && totalBill <= 40000) {
           discount  = totalBill * 0.3f;
       } else if (totalBill > 40000) {
           discount  = totalBill * 0.4f;
       }

       float totolPricePay = totalBill - discount;

        System.out.println("Total Discount availed is = "+ discount);
        System.out.println("Total Payable amount after discount is = "+ totolPricePay);
    }
}