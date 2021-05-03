package day_31_Arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
      int [] nums ={23,45,234,332,555,666};
        System.out.println(Arrays.binarySearch(nums,23)); // indexi veriyor. 0
        System.out.println(Arrays.binarySearch(nums,555));  // 4

        System.out.println(Arrays.binarySearch(nums,332)); // -2 index

        if(Arrays.binarySearch(nums,332)>=0){
            System.out.println("332 is present");
        }


    }
}
