package day_18_conditionsPractice;

public class SeasonFinderSwitch {
    public static void main(String[] args) {
        int month=5;
        switch (month){
            case 12: case 1: case 2: // aradaki iki nokta ustuste OR anlamina geliyor
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("fall");
            default:
                System.out.println("no such season");
                break;

        }
    }

}
