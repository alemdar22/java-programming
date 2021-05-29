package day_45_O_O_P;

public class TrafficLight { // colored grey cause it is not used before
    String color;
    public void showColor(){ // just shows the color,read only method
        System.out.println("Current color ="+color);
    }
    public void changeColor(String newColor){// you change/updates the color here so need a variable
        System.out.println("changing color to "+color);
        color=newColor;

    }
}
