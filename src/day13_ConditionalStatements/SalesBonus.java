package day13_ConditionalStatements;

public class SalesBonus {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 2000.55;

        if (salesAmount <= 2000) {
            System.out.println("Good job");
            bonus = 50.0;
            System.out.println(bonus);
        } else {
            System.out.println("Full bonus");
            bonus = 100.0;
            System.out.println(bonus);
        }
        System.out.println("Your total bonus is $" + bonus);
    }
}
