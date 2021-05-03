package day_32_Arrays_Split;
import java.util.*;
public class ArraySplitMethod {
    public static void main(String[] args) {
      /**  String words = "Shoes,Jacket,Gloves,Airpods,";
        String [] wordsArray =words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of wordArray: "+wordsArray.length);*/

        String sentence = "Murodil is a fine gentleman";
        String [] sentenceArray=sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        for (String each : sentenceArray){
            System.out.println(each);
        }
        System.out.println("Number of words is : "+sentenceArray.length);
    }
}
