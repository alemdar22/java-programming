package day_26_ForLoops;

public class CountMatches {
    public static void main(String[] args) {
        String word="javagram";
        char let ='a';
        int count=0;

        for (int i =0;i<word.length();i++){
            if(word.charAt(i)==let){
                count++;
            }
        }
        System.out.println(count);
    }
}
