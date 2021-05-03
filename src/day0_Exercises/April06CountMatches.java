package day0_Exercises;

public class April06CountMatches {
    public static void main(String[] args) {
        int count = 0;
        char letter = 'a'; // a nin kac kere gectigine bakiyoruz
        String word = "javala";

        for(int i = 0;i<word.length();i++){
            if(word.charAt(i)==letter){
                count++;
            }
        }
        System.out.println(count);

    }
}