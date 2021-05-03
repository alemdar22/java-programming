package day_20_String_manipulation;

public class ReplaceMethod {
    public static void main(String[] args) {
        String word ="java";
        System.out.println(word.replace("a","u"));

        String sentence = "java strings are fun";
        System.out.println(sentence.replace("a","o"));
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("java strings are fun","strings are fun"));
    }
}
