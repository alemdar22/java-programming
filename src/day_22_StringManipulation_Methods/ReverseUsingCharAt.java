package day_22_StringManipulation_Methods;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.println(word.charAt(word.length()-1)+""+word.charAt(2)+""+
                word.charAt(1)+""+word.charAt(0));

        String reverseWord =(""+word.charAt(word.length()-1)+word.charAt(2)+
                word.charAt(1)+word.charAt(0));
        System.out.println(word+reverseWord);
        if(word.equalsIgnoreCase(reverseWord)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
    }
}
