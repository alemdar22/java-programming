package day13_ConditionalStatements;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hour,minute,second, AM or PM");
        int hour;
        int minute;
        int second;
        String amOrPm;
        hour=scan.nextInt();
        minute=scan.nextInt();
        second= scan.nextInt();
        amOrPm=scan.next();
        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);

    }
}
