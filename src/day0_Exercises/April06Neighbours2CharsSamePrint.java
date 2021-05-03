package day0_Exercises;

public class April06Neighbours2CharsSamePrint {
    public static void main(String[] args) {
        String word ="alaaarra";


        for(int i =0;i<word.length()-1;i++){
            //System.out.print(word.charAt(i));
            //System.out.println(word.charAt(i+1));
            if(word.charAt(i)==word.charAt(i+1) ){
                System.out.println(word.charAt(i)+ " beep");
            }

            }
        }

        }


