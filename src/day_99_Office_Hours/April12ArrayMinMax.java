package day_99_Office_Hours;

public class April12ArrayMinMax {
    public static void main(String[] args) {
        int [] nums ={3,4,2,5,6,7,2};

        int min=nums[0];
        int max=nums[0];

        for (int each:nums){
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }
        }
        System.out.println("min num is "+min);
        System.out.println("max num is "+max);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<nums.length){
                min=nums[i];
            }
        }
        System.out.println(min);

    }
}
