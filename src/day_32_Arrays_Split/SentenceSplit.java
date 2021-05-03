package day_32_Arrays_Split;
import java.util.*;
public class SentenceSplit {
    public static void main(String[] args) {
        String sentence ="java is fun";
        String [] wordsArray = sentence.split(" ");
        System.out.println(wordsArray[0]);
        System.out.println(wordsArray[1]);
        System.out.println(wordsArray[2]);

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] resultArray=googleResult.split(" ");
        System.out.println(resultArray[1]);
        System.out.println(resultArray[3].replace("(",""));
    }
}
