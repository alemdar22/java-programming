package day0_Exercises;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours,minutes,seconds;
        System.out.println("Enter input seconds");
        int inputSeconds = scan.nextInt();
        hours=inputSeconds/3600;
        int remainingSecAfterHours=inputSeconds%3600;
        minutes=remainingSecAfterHours/60;
        seconds=remainingSecAfterHours%60;
        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");

    }
}
