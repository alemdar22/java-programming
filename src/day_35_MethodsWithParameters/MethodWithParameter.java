package day_35_MethodsWithParameters;

public class MethodWithParameter {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(25);
        displayValue(1);
        int count = 55;// burada int deklare edip count asagiya yazdirdik
        displayValue(count);
        yourName("Murodil");

    }
    public static void displayValue(int num){
        System.out.println("Num is "+num);
    }
    public static void yourName(String name){
        System.out.println("Your name is "+name);
    }
}
