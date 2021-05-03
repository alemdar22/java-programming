package day0_Exercises;

import java.util.Scanner;

public class March31GiveMe100ForLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int dollars = 0; dollars <= 100 ; dollars++) {
            System.out.println("Give me 100 bucks");
            dollars = scan.nextInt();
            if (dollars != 100) {
                System.out.println("this not 100");
            }

        }
        System.out.println("thanks");
    }
}