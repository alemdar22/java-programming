package day0_Exercises;

public class May_5_Review {
    public static void main(String[] args) {
        String [] colors={"red","blue","black","white","orange"};
        System.out.println(colors[0]);
        System.out.println(colors[0]+" "+colors[1]);
        System.out.println(colors[2].toUpperCase());

        int [] nums= {2,5,8,9,10};
        for (int i =0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println();
        for (int each:nums){
            System.out.print(each);
        }


    }
}
