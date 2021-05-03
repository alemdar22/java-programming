package day08_castin_scanner;

import java.util.Scanner;

public class AskAgeV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();
        //age= scan.nextInt();
        System.out.println(age+ " -that's a great age.");

    }
}
