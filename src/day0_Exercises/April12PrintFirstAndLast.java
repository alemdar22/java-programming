package day0_Exercises;
import java.util.*;
public class April12PrintFirstAndLast {
    public static void main(String[] args) {
        String[] words = {"ergo", "hat", "lululu", "rabbit", "parisien", "dert"};
        String firstAndLast = words[0].substring(0, 1) + words[0].substring(words.length - 2);
        System.out.println(firstAndLast);
        for (String each : words) {

        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + ", " + words[i + 1] + ", " + words[i + 2]);


        }
    }
}
