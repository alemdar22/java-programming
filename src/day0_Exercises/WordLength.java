package day0_Exercises;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();
        System.out.println(word1.length());
        System.out.println(word2.length());
        if((word1.length())>(word2.length())){
            System.out.println(word1);
        }else{
            System.out.println(word2);
        }

    }
}
