package day0_Exercises;

import java.util.Scanner;

public class March31CountUntil {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("enter start number");
        int start = input.nextInt();
        System.out.println("enter end number");
        int end = input.nextInt();
        for (int i = start;i<=end;i++){
            if(i%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
            System.out.print(i+"-");
        }

    }
}
