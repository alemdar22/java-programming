package day00_MethodsWithReturn;

import java.util.Random;

public class InfoAlemdar {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());

        System.out.println(getRandomYear());

    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear= random.nextInt(2021);
        return randomYear;
    }
}
