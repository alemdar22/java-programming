package day_31_Arrays;
import java.util.*;
public class ArrayEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println(Arrays.equals(nums1, nums2)); //num==num calismaz
        if (Arrays.equals(nums1, nums2)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        if (Arrays.equals(nums1, nums3)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        System.out.println(Arrays.equals(cars1,cars2));
        System.out.println(Arrays.equals(cars1,cars3));


    }
}