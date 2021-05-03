package day0_Exercises;

public class March31CountMatchingLetters {
    public static void main(String[] args) {
        String word ="alafranga";

        char letter='a';
        int count=0;

        for(int i =0;i<=word.length()-1;i++){
            if(word.charAt(i)==letter){
                count++;

            }

        }
        System.out.println(count);
    }
}
