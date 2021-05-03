package day0_Exercises;

public class SecondsCoverter2 {
    public static void main(String[] args) {

        int inputSeconds = 3295;
        int hour, minute, second;

        hour=inputSeconds/3600;
        int remainingSecond= inputSeconds%3600;
        minute=remainingSecond/60;
        second=remainingSecond%60;

        System.out.println(hour+" hours "+minute+" minutes "+second+" seconds");


    }
}
