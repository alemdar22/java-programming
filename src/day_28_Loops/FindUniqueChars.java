package day_28_Loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word= "javva";
        String unique="";


        for(int i =0;i<word.length();i++){
            if(!unique.contains(word.charAt(i)+"")){ //+"" chari alip string yapar
                unique+=word.charAt(i);

            }
        }
        System.out.println(unique);
    }
}
