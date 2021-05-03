package day0_Exercises;

public class March31Alphabet2 {
    public static void main(String[] args) {
        char letter = 'z';

        for(int i = 'a';i<='m';i+=2){  // i+=2 oldugu icin bir atlayarak yazdi
            System.out.print((char)i+" ");// letter degerini loop icinde verdik.
        }
        System.out.println();

        while(letter>='a'){  //letter degerini tepeden aldi.
            System.out.print(letter);
            letter--;
        }
    }
}
