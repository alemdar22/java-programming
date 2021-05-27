package day00_MethodsWithReturn;

public class CalculatorAlemdar {
    public static void main(String[] args) {
        add(2.3,1.4);
        System.out.println( add(2.3,1.4));

    }
    public static double add(double num1,double num2){
        double sum = num1+num2;
        return sum;
    }
}
