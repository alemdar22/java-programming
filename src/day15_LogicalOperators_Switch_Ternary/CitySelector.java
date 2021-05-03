package day15_LogicalOperators_Switch_Ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "Moscow";
        String city2 = "LA";
        if (city1.equals("Moscow") || city2.equals("LA")) {
            System.out.println("Hit the road");
        } else {
            System.out.println("Stay home");
        }
        String teacher = "Saim";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Heyyy   Java class");
        } else {
            System.out.println("Soft skill class");
        }
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is Java ");
        }else if(teacher.equals("Nadir")){
            System.out.println("Soft skills");
        }else if(teacher.equals("Gurhan")){
            System.out.println("Selenium class");
        }else{
            System.out.println("Play Kahoot");
        }

        String company = "Google;";
        double salary = 900000.0;

        if (company.equals("Google")||salary>=100000){
            System.out.println("Jump in");
        }else{
            System.out.println("Keep applying");
        }
    }
}