package day0_Exercises;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cars = 1;
        while (cars <= 5) {
            System.out.println("car is parked " + cars);
            cars++;
        }
        System.out.println("All cars are parked");

        System.out.println("Enter the number");
        int count=1;
        int number = scan.nextInt();
        while(count<=number){
            System.out.print(count+" ");
            count+=2;
        }
        System.out.println();
        System.out.println("counting completed");
    }

}
