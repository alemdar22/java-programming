package day0_Exercises;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt(); ;

        if(a>b){
            System.out.println(a+" is greater");
        }else if (a<b){
            System.out.println(b+" is greater");
        }else{
            System.out.println(a+" and "+b+" are equal");
        }
    }
}
