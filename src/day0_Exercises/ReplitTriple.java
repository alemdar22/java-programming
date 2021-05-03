package day0_Exercises;

import java.util.Scanner;

public class ReplitTriple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String str = scan.next();
        int count = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            System.out.println(str.substring(i,i+3).equals(str.substring(i,i+3)));
            count++;
        }

        System.out.println(count);
    }
}