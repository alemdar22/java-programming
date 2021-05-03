package day0_Exercises;

public class April07Arrays {
    public static void main(String[] args) {
        String [] employee= {"Gary","White","finance","34","LA","college"};
        System.out.println(employee.length);
        System.out.println(employee[0]+" "+employee[1]);
        System.out.println(employee[2].toUpperCase()+" "+employee[5].toUpperCase());

        int [] nums ={11,112,23,233,54,34,3432,556,65,66,89};
        for (int i = 0 ; i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        for( int newNum:nums) {
            if (newNum < 70) {
                System.out.print(newNum + "-");
            }
        }

    }
}
