package day0_Exercises;

import java.util.Scanner;

public class March31GiveMe100 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me $100");
        int dollars =scan.nextInt();
        while(dollars!=100){
            System.out.println("This not 100, give me 100.");
            dollars=scan.nextInt();

        }
        System.out.println("Thank you");
    }
}
