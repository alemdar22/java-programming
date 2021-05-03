package day0_Exercises;

public class FizBuzWithLoop {
    public static void main(String[] args) {

        for (int i =1; i <=100;i++){
            if(i %4==0 && i%6==0){
                System.out.println("FizBuz number"+i);
            }else if(i%4==0){
                System.out.println("Fiz num"+i);
            }else if(i%7==0){
                System.out.println("Buz num"+i);
            }
        }
    }
}