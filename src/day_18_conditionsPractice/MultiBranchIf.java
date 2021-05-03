package day_18_conditionsPractice;

import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " positive");
        } else if (number < 0) {
            System.out.println(number + " negative");
        } else {
            System.out.println(number + " zero");
        }
    }
}
