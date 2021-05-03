package day08_castin_scanner;

import java.util.Scanner;

public class MileConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles= scan.nextDouble();
        double kms = miles*1.609;
        System.out.println(miles +" miles are "+ kms+ " km");
    }
}
