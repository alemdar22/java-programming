package day_21_ReplacePractice;

public class FirstAndLastCharCheck {
    public static void main(String[] args) {
        String word = "mom";
        if(word.charAt(0)==word.charAt(2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String word2= "aziza";
        char first = word2.charAt(0);
        char last =word2.charAt(word2.length()-1);
        if(first==last){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        String wordd ="alemdar";
        System.out.println(wordd.charAt(0)+""+wordd.charAt(wordd.length()-1));
    }
}
