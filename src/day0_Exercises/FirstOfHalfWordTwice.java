package day0_Exercises;

import java.util.Scanner;

public class FirstOfHalfWordTwice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.next();
        System.out.println(word.substring(0,(word.length()/2)));
    }
}
