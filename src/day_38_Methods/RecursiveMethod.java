package day_38_Methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printTo100(1);
    }
    public static void printTo100( int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            printTo100(num);
        }
    }
}
