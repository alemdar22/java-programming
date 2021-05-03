package day_21_ReplacePractice;

public class IndexOfMethod {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.indexOf("j"));
        System.out.println(word.indexOf("va")); //  bu durumda ilk harfin pozisyonunu verir
        System.out.println(word.indexOf("b")); //bulamadiginda  -1 yazar
    }
}
