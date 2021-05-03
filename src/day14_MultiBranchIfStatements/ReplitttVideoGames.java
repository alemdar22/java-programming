package day14_MultiBranchIfStatements;

import java.util.Scanner;

public class ReplitttVideoGames {
    public static void main(String[] args) {

     Scanner scan= new Scanner(System.in);
        System.out.println("Enter number of coupons");
      int coupons=scan.nextInt();
      if(coupons<3){
          System.out.println("Not enough coupons");
      }else {
          System.out.println("Number of Candies: "+(coupons/10));
          System.out.println(("Number of Gumballs: "+(coupons/10)%3));
      }
    }
}
