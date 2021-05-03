package day14_MultiBranchIfStatements;

import java.util.Scanner;

public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather?");
        String weather = scan.next();
        if(weather.equals("sunny")){
            System.out.println("Go to park");
        }else if(weather.equals("rainy")){
            System.out.println("Stay home");
        }else if(weather.equals("snowy")){
            System.out.println("Clean up the drive way");
        }else if(weather.equals("windy")){
            System.out.println("Fly kite");
        }else{
            System.out.println("Code Java");
        }
        System.out.println("Keep loving Java");

    }
}
