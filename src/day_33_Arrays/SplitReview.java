package day_33_Arrays;
import java.util.*;
public class SplitReview {
    public static void main(String[] args) {
      String  word="java";
      String [] wordArray= word.split("a");
        System.out.println(wordArray.length);
        int countOfA= wordArray.length;//guvenilir bir kod degil. sonda a olunca sapitiyor
        System.out.println(countOfA);


    }
}
