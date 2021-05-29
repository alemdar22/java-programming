package day0_Exercises;
import java.util.*;
public class ArrayUtilities {
    public static void main(String[] args) {
        int[] nums = {5, 3, 99, 6, -3, 44, 2, 678};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[nums.length - 1]);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

            System.out.println();

            String[] names = {"tek", "hep", "bek", "gak"};
            Arrays.sort(names);
            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.binarySearch(names,"gak"));


        }
    }
}