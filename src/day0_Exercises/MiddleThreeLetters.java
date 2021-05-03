package day0_Exercises;

import java.util.Scanner;

public class MiddleThreeLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.next();

        if(word.length()%2==1 && word.length()>5){
            System.out.println(word.substring((word.length()/2-1),(word.length()/2+2)));
        }else{
            System.out.println("invalid");
        }
    }
}
