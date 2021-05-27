package day00_MethodsWithReturn;

import java.util.Random;

public class RandomYearInci {
    public static void main(String[] args) {
        System.out.println(giveMeRandomYear());


    }
    public static int giveMeRandomYear(){
        Random random = new Random();
        int randomYear=random.nextInt(2500);
        return randomYear;
    }
}
