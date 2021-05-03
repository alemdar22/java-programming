package day08_castin_scanner;

import java.util.Scanner;

public class SppedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        int overLimit;
        overLimit= currentSpeed-speedLimit;
        System.out.println("You are driving "+overLimit+" mph over the speed limit");







    }
}
