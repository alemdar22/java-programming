package day_23_String__Manipulation;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word= " woo  den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "bethesda";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1));


    }
}
