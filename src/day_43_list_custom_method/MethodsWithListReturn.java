package day_43_list_custom_method;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        System.nanoTime();// 1 second= 1.000.000.000 nano seconds
        System.out.println(System.nanoTime());

        List<Integer> mlnNums=getIntegerList();//returns ready Arraylist object.no need for new Arraylist
        System.out.println(mlnNums);
        //getIntegerList();
        int [] arr = getIntegerArray();

        /**
         * getIntegerList
         * return List<Integer>
         *     Loop from 0-1000000
         *     and add to Arraylist and return it
         */
    }
    public static List<Integer> getIntegerList(){
        List<Integer>nums= new ArrayList<>();
        for (int i=0;i<=1000000;i++)
            nums.add(i);
        return nums;
    }

    public static int [] getIntegerArray () {
        //declare empty array with 1000001
   int []nums = new int[1000001];
    //loop and assign numbers
   for(int i = 0; i<=1000000;i++){
       nums[i]=i;
   }
    return nums;
    }


}