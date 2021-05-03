package day12_boolean_conditionalStatements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit = 55;
        System.out.println(currentSpeed>speedLimit);
        boolean isSpeeding =currentSpeed>speedLimit;
        System.out.println("Is speeding? "+isSpeeding);

        currentSpeed+=25;
        isSpeeding =currentSpeed>speedLimit;
        System.out.println("Is speeding? "+isSpeeding);

        double accountBalance= 250.25;
        double itemPrice = 100;
        System.out.println(accountBalance >= itemPrice);

        boolean canAfford =accountBalance >= itemPrice;
        System.out.println("Affordable? "+canAfford);

        accountBalance-=itemPrice;
         canAfford =accountBalance >= itemPrice;
        System.out.println("Affordable? "+canAfford);

        boolean isBroke =accountBalance<=0;
        System.out.println("Is broke? "+isBroke);



    }
}
