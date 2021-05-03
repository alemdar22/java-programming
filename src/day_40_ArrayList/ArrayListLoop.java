package day_40_ArrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(23);nums.add(76);nums.add(45);
        nums.add(33);nums.add(11);nums.add(765);
        System.out.println(nums.size());
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);

        nums.remove(new Integer(45));//sayi olarak 45i remove ettik,index olarak degil
        System.out.println(nums); //once wrapper class yaptik
         for (int i = 0;i<nums.size();i++){
             System.out.print(nums.get(i)+" ");
         }
        System.out.println();
         for (int each:nums){
             System.out.print(each+" ");
         }
    }
}
