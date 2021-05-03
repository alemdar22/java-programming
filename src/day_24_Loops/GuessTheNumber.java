package day_24_Loops;
import java.util.*;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          Random randomNum = new Random();
        int secretNumber =randomNum.nextInt(101);
        int guessNumber;

        do{
            System.out.println("Guess the secret number");
            guessNumber= scan.nextInt();
            if(guessNumber>secretNumber){
                System.out.println("Wrong ,your number is too big ");

            }else if(guessNumber<secretNumber){
                System.out.println("Wrong, your number is too small");}
        }while (secretNumber!=guessNumber);

        System.out.println("Congrats ,you won");
    }
}
