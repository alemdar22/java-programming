package day0_Exercises;

import java.util.Scanner;

public class April05_JavaEqualsPhyton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence ");
        String sentence = scan.nextLine();
        int javaCount = 0;
        int phytonCount = 0;
        String word1="";
        String word2="";

        for (int i = 0; i <= sentence.length() - 4; i++) {
            word1=sentence.substring(i,i+4);
            if(word1.equals("java")){
                javaCount++;
            }
        }
        for(int i = 0; i<=word2.length()-6;i++){
            word2=sentence.substring(i,i+6);
            if(word2.equals("phyton")){
                phytonCount++;
            }
        }
        System.out.println(javaCount==phytonCount);
        }
    }

