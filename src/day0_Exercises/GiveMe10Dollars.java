package day0_Exercises;

import java.util.Scanner;

public class GiveMe10Dollars {
    public static void main(String[] args) {
        int dollars =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $10");
        while(dollars!=10){

            dollars= scan.nextInt();
            System.out.println("This is not $10");
        }
        System.out.println("thnx");
    }
}
