package day0_Exercises;
import java.util.*;
public class Quizzez {
    public static void main(String[] args) {
        char [] array ={'D','C','A','B'};
         Arrays.sort(array);

         for(char each:array){
             System.out.println(each+" ");
             if (each=='D'){
                 continue;
             }
         }




    }
}
