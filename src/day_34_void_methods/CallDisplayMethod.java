package day_33_void_methods;

import day0_Exercises.April13VoidMethodExercises;

public class CallDisplayMethod {
    public static void main(String[] args) {
        FirstMethod.displayMessage();
        April13VoidMethodExercises.watchMovie(); //yukari ya da koyabilirsin

        for (int i =0;i<=10;i++){
            System.out.print(i+" ");
            FirstMethod.displayMessage();
        }
        April13VoidMethodExercises.watchMovie(); // asagiya da koyabilirsin.
    }

}
