package day0_Exercises;

public class NonVoidMethodsWithParameters {
    public static void main(String[] args) {
        System.out.println(weather(" the weather is sunny"));
        System.out.println(myNumbers(45,67));

    }
    public static String weather(String howIsWeather){
        return howIsWeather;
    }
    public static int myNumbers(int giveMeNums,int yourNums){
        int result =giveMeNums * yourNums;
        return result;
    }
}
