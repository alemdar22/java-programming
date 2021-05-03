package day0_Exercises;

import java.util.Scanner;

public class ReplitCountHi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int count =0;
        System.out.println("Enter word");
        String str = scan.nextLine();
        for (int i =0; i <=str.length()-3;i++){
            if(str.substring(i,i+3).equals("cin")){
                count++;
            //System.out.println(count);
            }
        }
        System.out.println(count);
}
}