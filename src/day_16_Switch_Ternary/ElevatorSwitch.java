package day_16_Switch_Ternary;

public class ElevatorSwitch {
    public static void main(String[] args) {
     int floorNum=7;
     switch (floorNum){
         case 1:
             System.out.println("Floor is 1");
             break;
         case 2:
             System.out.println("Floor is 2");
             break;
         case 3:
             System.out.println("Floor is 3");
             break;
         default:
             System.out.println("Invalid floor");
     }
    }
}
