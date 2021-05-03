package day0_Exercises;
import java.util.*;

public class April12FindShortestArray {
    public static void main(String[] args) {
        String[] words = {"ergo", "hat", "lululu", "parisien"};
        String shortest =words[0];
        for (String each:words){
            if(each.length()<shortest.length()){
                shortest=each;
            }
        }
        System.out.println(shortest);
        System.out.println("=====================================");
        String  longest=words[2];

        for (String each:words){
            if(each.length()>longest.length()){
                longest=each;
            }
        }
        System.out.println(longest);
        System.out.println(words[1].substring(0,1)+words[0].substring(0,2));
        }



    }
