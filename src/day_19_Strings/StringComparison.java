package day_19_Strings;

public class StringComparison {
    public static void main(String[] args) {
        String city ="Bethesda";
        System.out.println(city.equals("Bethesda"));
        System.out.println(city.equals("bethesda"));

        System.out.println(city.equalsIgnoreCase("Bethesda"));
        System.out.println(city.equalsIgnoreCase("BETHESDA"));
        System.out.println(city.equalsIgnoreCase("BetHESda"));

        if(city.equalsIgnoreCase("betHeSDa")){
            System.out.println(city);
        }
    }
}
