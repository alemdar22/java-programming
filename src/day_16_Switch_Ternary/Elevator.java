package day_16_Switch_Ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 5;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies..Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selectes.Companies..Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected .Companies.Lyft, BofA, Stake house.");
        } else {
            System.out.println("Invalid floor "+floorNum);
        }
    }
}
