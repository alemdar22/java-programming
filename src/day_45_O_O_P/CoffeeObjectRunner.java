package day_45_O_O_P;

public class CoffeeObjectRunner {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        System.out.println("coffee amount: "+coffee1.getAmount());

        coffee1.refill();
        System.out.println("amount after refill: "+coffee1.getAmount());

        coffee1.drink(10);
        System.out.println("amount after drinking 10 = "+coffee1.getAmount());

        coffee1.setType("Turkish");
        System.out.println("Type of my coffee is "+coffee1.getType());
        //describe my coffee-show all variables
        //System.out.println(coffee1.toString());

        Coffee coffee2 = new Coffee();
        coffee2.setType("espresso");
        System.out.println("type of coffee2 is "+coffee2.getType());

    }
}
