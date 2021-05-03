package day0_Exercises;

public class AlphabetWithWhileLoop {
    public static void main(String[] args) {
        char letter = 'a';

        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        char let = 'z';

        while (let>='a'){
            System.out.print(let+"_");
            let--;
        }
    }
}
