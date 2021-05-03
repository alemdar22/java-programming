package day_37_methods_Overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(2, 4);
        sum(2.3, 5.6);
        sum(5,7,9);
        sum("212","111");

    }

    public static void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void sum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public static void sum(String num1, String num2) {
        System.out.println(num1 + num2);
    }
}