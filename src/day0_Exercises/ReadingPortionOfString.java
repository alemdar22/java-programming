package day0_Exercises;

public class ReadingPortionOfString {
    public static void main(String[] args) {
        String word = "selanselmanselkanselsel";

        int count = 0;
        for (int i = 0; i <= word.length()-4;i++){
            if(word.substring(i,i+2).equals("elan")){
                count++;
            }
        }
        System.out.println("count "+count);
    }
}