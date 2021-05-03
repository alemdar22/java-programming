package day0_Exercises;

public class April13VoidMethodPractice {
    public static void main(String[] args) {

        openTheDoor();
        for (int i =0;i<=10;i++){
            System.out.print(i+" ");
            openTheDoor();
        }
        shoesOff();
        for (int i = 0;i<=5;i++){
            System.out.print(i+" ");
            shoesOff();
        }
        lightsOn();
        for (int i =1 ; i<=5;i++){
            System.out.print(i+" ");
            lightsOn();
        }

    }
    public static void openTheDoor(){
        System.out.println("Take your key out to open the door");
    }
    public static void shoesOff(){
        System.out.println("Shoes off to keep home clean");
    }
    public static void lightsOn(){
        System.out.println("Turn lights on");
    }
}
