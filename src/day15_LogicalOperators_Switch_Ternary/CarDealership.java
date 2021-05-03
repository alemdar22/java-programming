package day15_LogicalOperators_Switch_Ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Honda";
        double carPrice = 5500.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("It is your dream car");
        } else {
            System.out.println("It is not in your budget");
        }
    }
}
