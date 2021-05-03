package day0_Exercises;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number .");
        int number = input.nextInt();
        int count = 0;
        while (count <= number) {
            System.out.print("count " + count+" ");
                count +=5;
                Thread.sleep(500);

        }
    }
}