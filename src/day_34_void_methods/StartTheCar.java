package day_33_void_methods;

public class StartTheCar {
    public static void main(String[] args) {
        sitInCar();  // below method is called so this command will print the statement.
        startTheCar(); // 2. methodu cagirdik
        shiftToDrive(); // 3.  methodu cagirdik
        pressGasPedal(); // 4. methodu cagirdik

    }
    public static void sitInCar(){
        System.out.println("1-Open the door and sit");
    }
    public static void startTheCar(){
        System.out.println("2-Press the start button");
    }
    public static void shiftToDrive(){
        System.out.println("3-Put the stick in D");
    }
    public static void pressGasPedal(){
        System.out.println("4-Press gas pedal with your foot");
    }
}
