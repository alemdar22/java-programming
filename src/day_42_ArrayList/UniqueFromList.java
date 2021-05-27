package day_42_ArrayList;


import java.util.*;


public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,6,6,4,4));
        // bir kere gorunenleri bulma

        //Collections.frequency(nums,6);
        //System.out.println(Collections.frequency(nums,6));
         // loop through the list
        for(int each:nums) {
            //check if the number appears 1 time
           if(Collections.frequency(nums,each)==1){
               //print
               System.out.print(each+" "); // 6 ve 4 iki kere yazildigindan listede yok.
           }
        }

        
    }
}
