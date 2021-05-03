package day13_ConditionalStatements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if (isHungry == true) {
            System.out.println("I am not hungry , code Java");
        } else {
            System.out.println("I am hungry, pick up something");
        }
        double price = 130.0;

        boolean isAffordable = price <= 200.0;

        if (isAffordable) {

            System.out.println("it is reasonable");
        } else {
            System.out.println("It is above my budget");

        }
        boolean isRemoteJob = true;

        if (isRemoteJob != true) {
            System.out.println("Sorry  i am not interested");
        } else{
            System.out.println("Sure i am interested.");
        }
    }
}