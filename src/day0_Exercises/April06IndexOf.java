package day0_Exercises;

public class April06IndexOf {
    public static void main(String[] args) {
        String word = "selenium";
        char letter = 'n';
        int index = 0;
        System.out.println(word.indexOf(letter));
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                index = i;
            }

        }
        System.out.println(index+" is for letter "+letter);

    }
}
