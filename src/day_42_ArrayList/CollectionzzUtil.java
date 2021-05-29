package day_42_ArrayList;
import java.util.*;
import java.util.concurrent.Callable;

public class CollectionzzUtil {
    public static void main(String[]args) {
       List<Character> letters = new ArrayList<>();
       letters.addAll(Arrays.asList('a','s','e','t','n','v','w','o','u'));
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(letters);

        //System.out.println(Collections.frequency((letters,'a')));
        Collections.replaceAll(letters,'s','q');
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println("after sort "+letters);

        List <Integer> nums = Arrays.asList(3,9,90,87,77,45,33,2,55,-3,2,44,3,44);

        System.out.println(nums);
        Collections.reverse(nums);
        System.out.println(nums);

        int max= Collections.max(nums);
        int min=Collections.min(nums);

        System.out.println(max);
        System.out.println(min);

        Collections.frequency(nums,44);
        int countOfFives= Collections.frequency(nums,44);
        System.out.println(countOfFives);

        Collections.replaceAll(nums,44,100);
        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

       // Collections.sort(nums,Collections.reverseOrder());
        //System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println();




            }


    }

