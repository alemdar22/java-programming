package day15_LogicalOperators_Switch_Ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeSipping = true;
        String itemName = "wooden spoon";

        if (onSale && freeSipping) {
            System.out.println(itemName + " Add in cart");
        } else {
            System.out.println("continue searching");
        }
        if (onSale && freeSipping && itemName.equals("wooden spoon")) {
            System.out.println("buy it");
        } else {
            System.out.println("keep looking");
        }
        String location = "DC";
        double salary = 100000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;
        if (location.equals("DC") && salary >= 100000 && isRemote && hasBenefits) {
            System.out.println("Take the offer");
        } else {
            System.out.println("Keep looking for a job");
        }

    }
}
