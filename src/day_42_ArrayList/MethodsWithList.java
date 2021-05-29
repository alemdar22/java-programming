package day_42_ArrayList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {

        printStrList(Arrays.asList("Pof","Tof","Hop","Sup"));

       List<Integer>nums = Arrays.asList(32,90,11,22);
       sumIntegerList(nums);
        System.out.println(sumIntegerList(nums));


    }
    public static void printStrList(List<String> stringList){
        for (String each:stringList){
            System.out.print(each+" ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer>integerList) {
        int sum =0;
        for (int each:integerList){
            sum+=each;
        }
        return sum;
    }
}
