package day0_Exercises;

public class March31MultiplicationClass1 {
    public static void main(String[] args) {
        int number=3;

        if(number<1 || number>10){
            System.out.println("invalid number");
            return;
        }
        for(int i =1;i<=10;i++){
            System.out.println(number*i);
        }
    }
}
