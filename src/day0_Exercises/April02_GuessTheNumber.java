package day0_Exercises;
import java.util.*;
public class April02_GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum =new Random();
        Scanner scan= new Scanner(System.in);
        int secretNumber=randomNum.nextInt(101);//100 e kadar olan sayilari random verir.
        int guessNumber;

        do {
            System.out.println("Guess secret number ");
            guessNumber = scan.nextInt();
            if (guessNumber > secretNumber) {
                System.out.println("number entered is larger than secret number");
            }else if (guessNumber < secretNumber) {
                    System.out.println("number entered is smaller than secret number");
                }

            }while (secretNumber !=guessNumber) ;
        System.out.println("congrats");
        }
    }
