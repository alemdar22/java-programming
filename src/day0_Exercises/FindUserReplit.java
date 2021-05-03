package day0_Exercises;

import java.util.Scanner;

public class FindUserReplit {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName=scan.nextLine();

        if(fullName.equalsIgnoreCase("Alan Parker")||fullName.equalsIgnoreCase("Ali Koc")){
            System.out.println("found");
        }else{
            System.out.println("fail");
        }
    }
}
