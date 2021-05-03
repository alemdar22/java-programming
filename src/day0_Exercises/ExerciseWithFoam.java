package day0_Exercises;

public class ExerciseWithFoam {
    public static void main(String[] args) {
        String name="foam";
        String name1 = new String("Alan");
        System.out.println(name1);
        System.out.println(name.equals("foam"));
        String sentence = "   Bethesda is Bethesda nice  ";
        System.out.println(sentence.indexOf("Bethesda1"));
        System.out.println(name.length());
        System.out.println(name.substring(name.length()-1));
        System.out.println(name.toUpperCase().charAt(name.length()-1));
        System.out.println(name.substring(name.length()-1).toUpperCase());

        System.out.println(name.startsWith("f"));
        System.out.println(name.isEmpty());

        System.out.println(sentence.replace("is","was"));
        System.out.println(sentence.replace('B','b'));
        System.out.println(sentence);
        System.out.println(sentence.replace("Bethesda","Germantown"));
        System.out.println(sentence.substring(0,9)+""+sentence.substring(0,9));
        System.out.println(sentence.trim());




    }
}
