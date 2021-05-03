package day_29NestedLoopAndArrays;

public class PrintStarsNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("@ ");
            }
            System.out.println(); // this print statement is to go to new line
        }
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("@ ");
            }
            System.out.println(); // this print statement is to go to new line
        }
    }
}