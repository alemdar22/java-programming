package day_35_MethodsWithParameters;
import java.util.*;

public class MultipleParameters {
    public static void main(String[] args) {
        /**Scanner scan= new Scanner(System.in);// scanner versiyonu
        System.out.println("enter two doubles");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);*/

        showSum(23.2,21.8);
        showSum(22,99);

        double num12=88;
        double num13=22;
        showSum(num12,num13);


    }
    public static void showSum(double num1,double num2){
        double sum = num1+num2;
        System.out.println("Sum is "+sum);

    }
}
