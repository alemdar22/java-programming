package day0_Exercises;


import java.util.Scanner;

public class whileLoopCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=1;
        System.out.println("Enter number" );
        int number = scan.nextInt();
        while(count<=number){
            System.out.println("count done"+count);
            count++;

        }


    }
}
