package day46_Encapsulation;

public class Car {
    //encapsulated instance variables
    private String model;
    private int year;
    private int mileage;//this.mileage degerini buradan alacak

    // setter method for car model
    public void setModel(String carModel){
        model=carModel;
    }

    // getter method for car model
    public String getModel(){
        return model;
    }
    // setter method for car year
    public void setYear(int year){
       this.year = year;
    }
    //getter for car year
    public int getYear(){
        return year;
    }
    public void  setMileage(int mileage){
        this.mileage=mileage;
    }
    public int getMileage(){
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }


}
