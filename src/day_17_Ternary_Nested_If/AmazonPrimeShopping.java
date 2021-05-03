package day_17_Ternary_Nested_If;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 50;
        boolean isPrimeMember = true;

        if(isPrimeMember){
            System.out.println("Eligible for 2 day free shipping");
        }else{
            if(itemPrice>=25){
                System.out.println("Eligible for regular free shipping");
            }else{
                System.out.println("No free shipping. $10 fee.");
            }
        }
    }
}
