package day12_boolean_conditionalStatements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price ");
        double totalPrice= scan.nextDouble();
        if(totalPrice>=25){
            System.out.println("Free shipping for you");
        }else{
            System.out.println("Your order is less than $25,need to pay for shipping. ");
        }
        System.out.println("Thanks for shopping Amazon");


    }
}
