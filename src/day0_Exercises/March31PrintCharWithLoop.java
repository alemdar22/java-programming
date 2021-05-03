package day0_Exercises;

public class March31PrintCharWithLoop {
    public static void main(String[] args) {
        String  word = "Some day";
        for(int i =0;i<=word.length()-1;i++){
            System.out.print(word.charAt(i));
            //System.out.println(word.substring(0,2));
        }
    }
}
