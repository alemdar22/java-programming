package day0_Exercises;

public class nnn {
    public static void main(String[] args) {
        String word2 = "ainciA";
        if ((word2.startsWith("a") || word2.endsWith("A")) || word2.startsWith("A") || word2.endsWith("a")) {
            System.out.println(word2.replace("a","").replace("A",""));
        } else {
            System.out.println(word2);
        }
    }
}