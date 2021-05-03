package day0_Exercises;

import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter name");
        String name= scan.next();

      for(int i =0;i <name.length();i++){
          System.out.println(name.charAt(i));
      }
        }




    }

