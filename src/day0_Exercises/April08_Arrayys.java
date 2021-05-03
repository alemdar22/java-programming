package day0_Exercises;

import java.util.Arrays;

public class April08_Arrayys {
    public static void main(String[] args) {

        int [] nums = {2,3,1,5999,43,103,22,567,321};
        String [] names={"Al","Bill","Sue","Matt"};
        char [] letters = {'d','b','c','a'};
        double [] prices ={2.3,1.45,3.0,9.99};

        System.out.println(nums.length);
        System.out.println(nums[nums.length-1]);
        for (int i = 0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for ( String naammes:names){
            System.out.print(naammes.toUpperCase()+" ");
        }
        System.out.println();
        for (char each:letters){
            Arrays.sort(letters);
        }
        System.out.print(Arrays.toString(letters));
        System.out.println();

        for (int each : nums){
            if(each>100){
                System.out.print(each+" ");
            }
        }
        System.out.println();
        for( String each:names){
            if(each.length()>3){
                System.out.print(each+" ");
            }
        }
        System.out.println();
        for(char let:letters){
            if (letters.length<=4){
                System.out.print(let+" | ");
            }
        }
        System.out.println();
        for (double each :prices){
            if(each<=2){
                System.out.print(each+" ");
            }
        }


        }


}
