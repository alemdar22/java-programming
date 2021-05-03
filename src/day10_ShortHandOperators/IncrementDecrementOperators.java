package day10_ShortHandOperators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = "+i);
        i++;
        System.out.println("i = "+i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = "+i);
        int linesOfCode = 15;
        System.out.println( " Lines of Code = "+linesOfCode);
        linesOfCode++;
        linesOfCode++;
        linesOfCode++;
        System.out.println(linesOfCode);

        linesOfCode=linesOfCode-1;
        System.out.println(linesOfCode);
        linesOfCode-=1;
        System.out.println(linesOfCode);
        linesOfCode--;
        System.out.println(linesOfCode);
        --linesOfCode;
        System.out.println(linesOfCode);

        char ltr = 'a';
        System.out.println(ltr);
        ltr++;
        System.out.println(ltr);
        ltr--;
        System.out.println(ltr);
        ltr--;
        System.out.println(ltr);
        ltr--;
        ltr--;
        ltr--;
        System.out.println(ltr);

    }
}
