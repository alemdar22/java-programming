package day_18_conditionsPractice;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 44;
        int num3 = 51;
        if (num1>=num2 && num1>=num3){
            System.out.println(num1+ " is biggest");
        }else if(num2>=num3 && num2>=num1){
            System.out.println(num2+" is biggest");
        }else{
            System.out.println(num3+ " is biggest");
        }
    }
}