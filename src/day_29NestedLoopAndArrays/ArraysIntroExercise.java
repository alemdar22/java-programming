package day_29NestedLoopAndArrays;

public class ArraysIntroExercise {
    public static void main(String[] args) {
        String[] names = new String[2];// 2 tane string element store ettik.(null)
        names[0] = "Ben";
        names[1] = "Sue";
        System.out.println(names[0]);
        System.out.println(names[1] + names[1]);

        System.out.println("============================================");
        int[] nums = {3, 6, 4, 7, 90, 33};
        nums [0]=99;
        System.out.println(nums[0]);
        System.out.println("index number 2 is : "+nums[2]);
        //System.out.println(nums[0]);
        //System.out.println(nums[1]);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        int[] numbers = {0,1, 2, 3, 4};
         int  len=numbers.length;
        System.out.println(len);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(numbers[0]);
        for (int i = 0; i < numbers.length; i++) {
            if (i <= 3) {
                System.out.print(numbers[i]+" ");
            }
        }

    }
}