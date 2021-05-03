package day0_Exercises;

public class StringShortQuiz1 {
    public static void main(String[] args) {
        String ta="A";
        ta=ta+"B";
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');// yeniden assign edilmemis o yuzden isleme girmiyor
        System.out.println(ta);// sonuc ABC
    }
}
