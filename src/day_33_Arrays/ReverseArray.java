package day_33_Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int [] nums={0,1,2,3,4,5};
        int [] numsArray=nums;

        for(int i = numsArray.length-1;i>=0;i--){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        String [] names = {"Al","Sue","Bill","Su"};
            String []namesArray=names;
            for(int i =names.length-1;i>=0;i--){
                System.out.print(names[i]+" ");
            }
        System.out.println();
            int [] numbers ={0,2,4,6,8,10};
            int [] numbersArray=numbers;

            for(int i = numsArray.length-1;i>=0;i--){
                System.out.print(numbers[i]+" ");
            }
        }


    }

