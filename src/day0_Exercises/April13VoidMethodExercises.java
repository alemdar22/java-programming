package day0_Exercises;

public class April13VoidMethodExercises {
    public static void main(String[] args) {
        April13VoidMethodPractice.shoesOff();
        watchMovie();
        phoneCall();

        for (int i =1;i<=5;i++){
            System.out.println(i);
            phoneCall();
        }
    }
    public static void watchMovie(){
        System.out.println("Seen Rambo 55?");
    }
    public static void phoneCall(){
        System.out.println("Call Mom");
    }
}
