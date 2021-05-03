package day08_castin_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cents tou have?");
        int cents = scan.nextInt();
        int dollars = cents/100;
        int remainingCents =cents % 100;
        System.out.println("You have "+remainingCents+ " cents left");

    }
}
