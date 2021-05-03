package day14_MultiBranchIfStatements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your selection");
        int selection = scan.nextInt();
        if(selection==1){
            System.out.println("hello");
        }else if(selection==2){
            System.out.println("hola");
        }else if(selection==3){
            System.out.println("merhaba");
        }else if(selection ==4){
            System.out.println("sposiba");
        }else if (selection==5){
            System.out.println("hu hu");
        }else{
            System.out.println("Code Java");
        }
        System.out.println("Thanks for calling");
    }
}
