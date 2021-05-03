package day0_Exercises;

public class StringShortQuiz3 {
    public static void main(String[] args) {
        String str = "java";
        String str1= new String("Java");
        if(str.equalsIgnoreCase(str1)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
    }
}
