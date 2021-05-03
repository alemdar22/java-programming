package day08_castin_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        int hourlyRate = scan.nextInt();
        int weaklyPay,monthlyPay,annualPay;

        weaklyPay = 40*hourlyRate;
        monthlyPay=weaklyPay*4;
        annualPay=monthlyPay*12;
        System.out.println(weaklyPay);
        System.out.println(monthlyPay);
        System.out.println(annualPay);
    }
}
