package day0_Exercises;

public class March31MultiplicationTable {
    public static void main(String[] args) {
        int num = 9;
        if (num < 1 || num >10) {//num < 1 || num > 10
            System.out.println("not valid");
            return;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
