package day_27_ForLoops;

public class IndexOf {
    public static void main(String[] args) {
        String word= "github";
        char letter ='m';
        int index=-1;
        for(int i =0;i<word.length();i++){
           // System.out.println(word.charAt(i));
           if(word.charAt(i)==letter){
               index=i;
               System.out.println(letter+ " "+index);//bunu disarda da yazabilirsin.
               break; // loop dan cik bitir.exit the loop.
           }

            }
        if(index==-1){}
        System.out.println(letter+" is not present");
        }
    }

