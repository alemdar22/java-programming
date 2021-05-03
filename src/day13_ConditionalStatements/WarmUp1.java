package day13_ConditionalStatements;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter area code and local number");
        int areaCode= scan.nextInt();
        int localNumber = scan.nextInt();

        System.out.println("Calling number "+'('+areaCode+')'+'-'+localNumber);
    }
}
