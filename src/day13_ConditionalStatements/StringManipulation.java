package day13_ConditionalStatements;

public class StringManipulation {
    public static void main(String[] args) {
        String city = "LA";

        if(city.equals("LA")){
            System.out.println("IT is LA");
        }else{
            System.out.println("It is not LA");
        }
        String weather = "sunny";

        if(weather.equals("sunny")){
            System.out.println("Get out");
        }else{
            System.out.println("Stay home");
        }
    }
}
