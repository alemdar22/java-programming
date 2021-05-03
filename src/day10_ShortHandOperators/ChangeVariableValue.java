package day10_ShortHandOperators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("Count : "+count);
        count = count+2;
        System.out.println("Count : "+count);
        int apples = 5;
        System.out.println("Apples "+apples);
        apples = apples+10;
        System.out.println("Apples "+apples);
        apples = apples - 3;
        System.out.println("Apples "+apples);
        int pizzaSlices = 8;
        System.out.println("pizza Slices "+pizzaSlices);
        pizzaSlices = pizzaSlices/2;
        System.out.println("pizza Slices "+pizzaSlices);
        pizzaSlices = pizzaSlices+6;
        System.out.println("pizza Slices "+pizzaSlices);

        int players = 10;
        System.out.println("players "+ players);
        players = players*2;
        System.out.println("players "+ players);

        int cents = 764;
        System.out.println(cents);
        int remainingCents = cents%100;
        System.out.println(remainingCents);
    }
}
