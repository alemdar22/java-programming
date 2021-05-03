package day_32_Arrays_Split;

public class ReverseSentence {
    public static void main(String[] args) {
        String word = "java is fun isn't it?";
        String [] wordArray= word.split(" ");
        String reversed="";
        for (int i = wordArray.length-1;i>=0;i--){
            reversed+=wordArray[i]+" ";

            //System.out.print(wordArray[i]+" ");
        }
        System.out.println(reversed);
    }
}
