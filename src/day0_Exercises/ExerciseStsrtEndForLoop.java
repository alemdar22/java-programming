package day0_Exercises;

import java.util.Scanner;

public class ExerciseStsrtEndForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter start");
        int start= input.nextInt();
        System.out.println("Enter end");
        int end = input.nextInt();
        for ( i = end;i>=start;i--) {
            //if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
       // System.out.print(i+" ");
    }


