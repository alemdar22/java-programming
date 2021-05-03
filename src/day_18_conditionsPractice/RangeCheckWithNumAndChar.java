package day_18_conditionsPractice;

public class RangeCheckWithNumAndChar {
    public static void main(String[] args) {
        int score = 96;
        if (score >= 1 && score <= 40) {
            System.out.println(score + " D");
        } else if (score > 40 && score <= 60) {
            System.out.println(score + " C");
        } else if (score > 60 && score <= 90) {
            System.out.println(score + " B");
        } else if (score > 90 && score <= 100) {
            System.out.println(score + " A");
        } else {
            System.out.println("Invalid entry");
        }
    }
}
