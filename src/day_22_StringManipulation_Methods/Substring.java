package day_22_StringManipulation_Methods;

public class Substring {
    public static void main(String[] args) {
      String name ="alemdar";
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(4));
        String word= "java is fun";
        System.out.println(word.substring(0,4)); // end index not included.
        System.out.println(word.substring(0,7));
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8));
        System.out.println(word.substring(word.length()-3));
        System.out.println(word.substring(5));
    }
}
