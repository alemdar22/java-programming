package day0_Exercises;

public class March31Alphabet {
    public static void main(String[] args) {
        char firstLetter ='A';


        while(firstLetter<='Z'){
            System.out.print(firstLetter);
            firstLetter++;
        }
        System.out.println();
        for (int i ='z';i>='a';i--){
            System.out.print((char)i+" ");
        }


    }
}
