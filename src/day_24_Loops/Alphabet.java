package day_24_Loops;

public class Alphabet {
    public static void main(String[] args) throws InterruptedException {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        char letter1 = 'z';
        while (letter1 >= 'a') {
            System.out.print(letter1);
            letter1--;


        }
        System.out.println();

        int linesOfCode = 25;
        while(linesOfCode>0){
            System.out.println("Java Code "+linesOfCode);
            linesOfCode-=5;
            Thread.sleep(500);
        }

    }
}