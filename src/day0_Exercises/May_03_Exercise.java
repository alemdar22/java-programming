package day0_Exercises;

import java.util.ArrayList;
import java.util.List;

public class May_03_Exercise {
    public static void main(String[] args) {
        List<String>myColors= new ArrayList<>();
        myColors.add("green");
        myColors.add(0,"yellow");
        myColors.add("blue");
        System.out.println(myColors);
        System.out.println(myColors.toString());
        myColors.set(0,"red");
        System.out.println(myColors);
        myColors.indexOf("blue");
        int indexBlue=myColors.indexOf("blue");
        System.out.println(indexBlue);
        myColors.set(indexBlue,"black");
        System.out.println(myColors);
        myColors.set(indexBlue,"brown");
        System.out.println(myColors);
        myColors.add("beige");
        myColors.add(myColors.size(),"dirty yellow");
        System.out.println(myColors);
        myColors.set(0,"creamy");


        if(myColors.contains("brown")){
            myColors.set(myColors.indexOf("brown"),"white");
            System.out.println(myColors);
        }else{
            System.out.println("invalid color");
        }
        System.out.println();

        if(myColors.contains("green")){
            myColors.set(myColors.indexOf("green"),"pink");
            System.out.println(myColors);
        }else{
            System.out.println("no green");
        }
    }
}
