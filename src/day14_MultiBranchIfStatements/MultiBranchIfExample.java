package day14_MultiBranchIfStatements;

import java.util.Scanner;

public class MultiBranchIfExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the day");
        int day = scan.nextInt();
        if (day ==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("thursday");
        }else if(day==5){
            System.out.println("friday");
        }else if(day==6){
            System.out.println("saturday");
        }else if(day==7){
            System.out.println("sunday");
        } else{
            System.out.println("No such day");
        }
        System.out.println("have a nice day");
    }
}
