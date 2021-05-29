package day_43_list_custom_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());

        System.out.println(getRandomList(10));

    }

    public static List<String> getDays() {
        List <String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        return days;
    }


       public static List<Integer> getRandomList(int size){
           Random random = new Random();// new random object
           List<Integer>nums = new ArrayList<>();
           for(int i = 0; i<=size;i++){
               nums.add(random.nextInt(101));//generate random number and add to list
           }
           return nums;
       }
}
