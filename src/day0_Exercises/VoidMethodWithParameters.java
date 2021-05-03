package day0_Exercises;

public class VoidMethodWithParameters {
    public static void main(String[] args) {
        giveMeNums(88);
        for (int i =1;i<5;i++){
            System.out.print(i+" ");
            giveMeNums(22);
        }
        greeting("hellooo");

    }
    public static void giveMeNums(int nums){
        System.out.println(nums);
    }
    public static void greeting(String morning){
        System.out.println(morning);
    }
}
