package day_26_ForLoops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 11;

        if (num < 1 || num > 10) {
            System.out.println("Error");
            return; // exit the method/ stop the code.
        }
            for (int i = 1; i <= 10; i++) {

                System.out.println(num + " x " + i + " = " + (num * i));

            }
        }

}
