package day0_Exercises;

public class April20CharArrayPractise {
    public static void main(String[] args) {
        char [] letters ={'j', 'a', 'v', 'a', ' ', 'i', 's', ' ','f', 'u', 'n'};
              for(char each:letters){
                  System.out.print(each+" ");
              }
        System.out.println();
              for (int i = 0;i<letters.length;i++){
                  System.out.print(letters[i]+" ");
              }
        System.out.println();
              String sentence = new String(letters);
        System.out.println(sentence);
        String word11= "red hat";
        char [] word11Array=word11.toCharArray();
        System.out.println(word11Array.length);
    }
}
