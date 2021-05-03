package day0_Exercises;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int player, house;
        System.out.println("Enter  player score ");
        player = scan.nextInt();
        System.out.println("Enter house score");
        house = scan.nextInt();

        if (player > 21){
            System.out.println("player bust");
        }else if(house > player){
            System.out.println("player loss");
        }else if(player == house){
            System.out.println("its a tie");
        }else if(player>house){
            System.out.println("player wins");
        }

    }
}
