package day_36_methods_with_Return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("sum = "+add(22,11));
        double add = add(22,11);
        System.out.println(add);
        System.out.println("sum = "+subtract(30,10));
        System.out.println("sum = "+divide(100,20));
        System.out.println("sum = "+multiply(10,2));


    }
    public static double add(double num1,double num2){
        double  sum =num1+num2;
        return sum;
    }
    public static double subtract(double num1,double num2){
        double sum = num1-num2;
        return sum;
    }
    public static double divide(double num1,double num2){
        double sum = num1/num2;
        return sum;
    }
    public static double multiply(double num1, double num2){
        double sum=num1*num2;
        return sum;
    }

}
