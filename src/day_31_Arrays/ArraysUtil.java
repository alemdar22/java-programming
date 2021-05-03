package day_31_Arrays;
import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums={2,99,12,65,45,33};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);// icinde sort etti. kucukten buyuge siraladi
        System.out.println(Arrays.toString(nums));// string olarak yazacak

        System.out.println(nums[nums.length-1]);
        //   asagida alfabetik olarak siraladi
        String [] word={"tak","cek","dak","duk","kuk"};
        System.out.println(String.join(" / ",word));
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));

    }
}
