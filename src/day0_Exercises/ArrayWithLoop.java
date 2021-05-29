package day0_Exercises;
import java.util.*;

public class ArrayWithLoop {
    public static void main(String[] args) {
        String[] trees = {"oak", "pine", "pear", "apple"};
        for (int i = 0; i < trees.length; i++) {
            if (trees[i].contains("pear")) {
                System.out.print(true);

            }
            System.out.println();
            for(String each:trees){
                if(each.equals("apple")){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}