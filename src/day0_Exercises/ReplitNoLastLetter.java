package day0_Exercises;

import java.util.Scanner;

public class ReplitNoLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String txt = scan.next();

        System.out.println(txt.substring(0,(txt.length()-1)));

    }
}
