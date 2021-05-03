package day0_Exercises;

import java.util.Scanner;

public class April05Triples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String str = scan.next();
        int count = 0 ;

        //WRITE YOUR CODE HERE
        for(int i=0;i<=str.length()-3;i++){
            String triples=str.charAt(i)+""+str.charAt(i)+""+str.charAt(i);
            if(str.substring(i,i+3).equals(triples)){
                count++;
            }

        }
        System.out.println(count);
    }

}
