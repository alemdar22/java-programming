package day14_MultiBranchIfStatements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2020;

        if (year == 2020) {
            System.out.println("Pandemic year");
            System.out.println("Wear mask");
        }
        System.out.println("Code Java");

        String country ="USA";

        if(country.equals("USA")){
            System.out.println("D.C is the capital");
            System.out.println("DC is nice");
        }
        System.out.println("Welcome to "+country);
    }
}
