package day00_MethodsWithReturn;

import java.util.Random;

public class RandomYearAlemdar {
    public static void main(String[] args) {
        System.out.println(getRanYear());

    }
    public static int getRanYear(){
        Random random = new Random();
        int randomYear=random.nextInt(2000);
        return randomYear;
    }
}
