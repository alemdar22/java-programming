package day0_Exercises;


import java.util.Scanner;

public class ReplitCatsandDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        System.out.println("Enter word");
        String word = scan.next();

        for (int i = 0; i <= word.length() - 3; i++) {
            if (word.substring(i,i+3).equals("cat")) {
                countOfCats++;
            } else if (word.substring(i,i+3).equals("dog")){
                   countOfDogs++;
                }
        }
        if(countOfCats==countOfDogs){
        System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    }
