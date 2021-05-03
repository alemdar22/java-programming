package day_33_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();// this is how we call the method below
        displayMessage();//as many times as we want, we can call it
        displayMessage();

        for (int i = 0; i<=100;i++){
            System.out.print(i+" - ");
            displayMessage();
        }
    }
    public static void displayMessage(){
        System.out.println("Hello Batch 22");
    }
}
