package day_17_Ternary_Nested_If;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drinkItem = "coke";
        String snack = "chips";


        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else if (selection.equals("snack")) {
            System.out.println("snack is selected");
            if (snack.equals("chips")) {
                System.out.println("chips selected");
            } else {
                System.out.println("candy is selected");
            }


        }

    }
}
