package day0_Exercises;

import java.util.Scanner;

public class April02_doWhilePinCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPin = 1234;
        int pincode;
        int attempts=3;

        do {

                System.out.println("enter pincode ");

                pincode = scan.nextInt();


            } while (pincode != secretPin) ;
            System.out.println("welcome to your account");


    }
}
