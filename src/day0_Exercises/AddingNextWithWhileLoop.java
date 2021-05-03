package day0_Exercises;

import java.util.Scanner;

public class AddingNextWithWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter numbers");
        int total=0;
        int nextNumber= scan.nextInt();
        while(nextNumber>0){

            total=total+nextNumber;
            System.out.println(total);
        }
    }
}
