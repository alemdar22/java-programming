package day0_Exercises;

import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();
        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }else if(num==0){
            System.out.println("zero");
        }else{
            System.out.println("invalid entry");
        }
    }
}
