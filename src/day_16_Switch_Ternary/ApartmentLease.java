package day_16_Switch_Ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numOfBedrooms=2;
        double startingPrice=0.0;
        switch(numOfBedrooms) {
            case 0:
                System.out.println("Studio apartmrnt selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("1 bedroom apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("2 bedroom apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println("Currently not available");
        }
        //System.out.println(numOfBedrooms+" bedroom apartment selected");
        System.out.println("Starting price is "+startingPrice);
    }
}
