package day0_Exercises;

public class ExerciseOddEvenForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " even ");
            } else {
                System.out.print(i + "odd ");
            }
        }
    }
}
