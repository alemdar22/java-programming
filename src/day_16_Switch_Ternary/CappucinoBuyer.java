package day_16_Switch_Ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = "grande";
        double price=0;
        int calory=0;
        switch (size){
            case "tall":
                System.out.println("Tall cappucino please");
                price =3.69;
                calory=90;
                break;
            case "grande":
                System.out.println("Grande cappucino please");
                price= 3.99;
                calory= 120;
                break;
            case "Venti":
                System.out.println("Venti cappucino please");
                price =4.29;
                calory=150;
                break;
            default:
                System.out.println("We do'nt serve that size of Cappuccino");


        }
            System.out.println("Total price: "+price);
        System.out.println( "You will consume "+calory+ " cal of energy");
    }
}
