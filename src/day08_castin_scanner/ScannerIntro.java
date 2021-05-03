package day08_castin_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter car type");
        String carType;
        carType=scan.next();
        System.out.println(carType + " is a nice car.");

    }
}
