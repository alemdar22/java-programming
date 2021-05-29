package day_45_O_O_P;

public class TrafficLightsObjectRunner {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight1= new TrafficLight();
        //trafficLight1.color="red"; >>> not good practise
        //we assign/update the value of color using a method of the class
        trafficLight1.changeColor("red");// method ile degistiryoruz
        //calling with the method to acces the variable
        trafficLight1.showColor(); // this is to print the color
        trafficLight1.changeColor("green");
        trafficLight1.showColor();//prints color

        TrafficLight trafficLight2= new TrafficLight();
        trafficLight2.changeColor("yellow");
        trafficLight2.showColor();

    }
}
