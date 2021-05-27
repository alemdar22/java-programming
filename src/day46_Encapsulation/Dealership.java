package day46_Encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1=new Car();
        //car1.model ="Toyota";
        //car1.price1=22.000;

        car1.setModel("Toyota");
        System.out.println(car1.getModel());

        car1.setYear(2020);
        System.out.println(car1.getYear());

        car1.setMileage(22000);
        System.out.println(car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1);//automatically calls toString() method

    }
}
