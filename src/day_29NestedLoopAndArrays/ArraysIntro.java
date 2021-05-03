package day_29NestedLoopAndArrays;

public class ArraysIntro {
    public static void main(String[] args) {
       int [] nums = new int[3];// declaration af arrays of how many of them(SIZE)
        nums[0]=5;// value assigned for array
        nums[1]=7;
        nums[2]=10;
        System.out.println("value at index 0 ="+nums[0]);
        System.out.println("value at index 1 ="+nums[1]);System.out.println("value at index 2 ="+nums[2]);
        int i =0;
        System.out.println(nums[i]);// int variable to specify index
        i++;System.out.println(nums[i]);
        System.out.println("number of elements in array "+nums.length);//  finding the SIZE of array.
         int  len = nums.length;
         nums[0]=100;//  change values in the array
         nums[1]=300;
         nums[2]=nums[1];
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        int [] numbers = {23,44,12,21,55,665,89};
        System.out.println("the size (length) the numbers array "+numbers.length);
        System.out.println(numbers[0]);
    }
}
