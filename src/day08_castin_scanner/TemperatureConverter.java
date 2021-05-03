package day08_castin_scanner;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Value");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit -32) * 5 / 9;
        System.out.println("Fahrenheit " + fahrenheit +" is "+celsius+" celsius.");
    }
}
