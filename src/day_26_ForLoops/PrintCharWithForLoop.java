package day_26_ForLoops;

public class PrintCharWithForLoop {
    public static void main(String[] args) {
        String word= "Hello Guys";

        for (int i =0;i<word.length();i++){
            System.out.println(i+" "+word.charAt(i));
        }

        for( int k = word.length()-1; k>=0;k--){
            System.out.print(word.charAt(k));
        }


        }

    }

