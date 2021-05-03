package day_37_methods_Overloading;

import java.util.Arrays;

public class OverLoadingMainMethod {
    public static void main(String[] args) {
        main(3,8);
        System.out.println(Arrays.toString(args));

    }
    public static void main(int num1,int num2){
        System.out.println("result :"+num1*num2);
    }
}
