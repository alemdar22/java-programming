package day_33_Arrays;
import java.util.*;
public class SplitReview3 {
    public static void main(String[] args) {
        String word2 = "java1html2sql";
        String []word2Array=word2.split("\\d");//(\\d splits by any number
        System.out.println(Arrays.toString(word2Array));

        String password = "bcTd123_5*polk00>";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
