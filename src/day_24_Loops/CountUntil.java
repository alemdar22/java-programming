package day_24_Loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        int start=1;

        while(start<=number){
            System.out.print("Number "+start+",");
            start++;
        }
    }
}
