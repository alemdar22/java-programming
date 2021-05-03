package day0_Exercises;

public class StringShortQuiz6 {
    public static void main(String[] args) {
        String s1 ="wooden spoon";
        String s2 =s1.substring(s1.indexOf("s"));
        System.out.println(s2);
        System.out.println(s1.substring(s1.length()-1));

        boolean result =!false!=("x"!="y");
        System.out.println(result);
    }
}
