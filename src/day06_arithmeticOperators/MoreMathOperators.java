package day06_arithmeticOperators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas =431;
        int honda = 287;
        int vw =2;
        int nissan = 16;
        int numOfCars= toyotas+honda+vw+nissan;
        System.out.println(numOfCars);

        String pizza = "Hawaiian";
        int slices = 8;
        int numOfPeople = 4;
        int slicesPerPerson = slices/numOfPeople;

        System.out.println(slicesPerPerson);

        System.out.println("We ordered "+pizza+" pizza with "+slices+" slices,"+numOfPeople+" people ate "+slicesPerPerson+ " slices each.");


    }
}
