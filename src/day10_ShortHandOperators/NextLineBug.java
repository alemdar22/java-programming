package day10_ShortHandOperators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values");
        double rent = scan.nextDouble();
        scan.nextLine();
        String month = scan.nextLine();
        System.out.println(rent);
        System.out.println(month);
    }
}
