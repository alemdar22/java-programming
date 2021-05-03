package day0_Exercises;

import java.util.Arrays;

public class April19ArrayExercises {
    public static void main(String[] args) {

        int[] nums = new int[3];
        System.out.println(nums[0]); //value assign edilmediyse default value 0
        /*nums[0] = 1;
        nums[1]= 5;
        nums[2]=10;
        nums[2]=nums[1];
        System.out.println(nums[2]);
        System.out.println(nums[0]);
        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);*/

        int[] num1 = {2, 4, 8};
        System.out.println("num1 : " + Arrays.toString(num1));
        System.out.println(num1.length);


        int len = num1.length;
        System.out.println(len);

        int[] numbers = {30, 22, 44, 54, 89,};
        double[] prices = {2.11, 3.4, 6.5};
        String[] cities = {"LA", "Baku", "Van"};

        String[] student1 = {"12345", "Alemdar", "Alemdarisko", "8877", "234 2211133"};

        System.out.println("name :" + student1[1] + " " + student1[2]);
        if (student1.length == 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        System.out.println(student1[1].substring(0, 4));
        System.out.println(student1[4].startsWith("3"));
        System.out.println(student1[4].length());
        String phoneNum = student1[4];
        System.out.println(phoneNum);
        System.out.println();

        String[] cities1 = {"LA", "Baku", "Van", "Ankara"};
        for (int i = 0; i < cities1.length; i++) {
            System.out.print(cities1[i] + " ");
        }

        for (String each : cities1) {
            System.out.println(each);
        }

        System.out.println();
        int[] manyNums = {22, 11, 13, 150, 64, 333, 675, 90, 65, 999};
        for (int each : manyNums) {
            System.out.print(each + " ");
        }
        System.out.println();
        for (int i = 0; i < manyNums.length; i++) {
            System.out.print(manyNums[i]+" ");
        }
        System.out.println();

        System.out.println("last value of array :"+manyNums[manyNums.length-1]);
        System.out.println();
        for (int i = 0;i<manyNums.length;i+=2){
            System.out.println(manyNums[i]);
        }
        System.out.println();
        for (int i = manyNums.length-1;i>=0;i--){
            System.out.print(manyNums[i]+" ");
        }
    }
        }
