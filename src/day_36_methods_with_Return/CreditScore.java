package day_36_methods_with_Return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(800);
        System.out.println(getCreditScore());
        study();
        System.out.println(shoppingList());

    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("You are eligible for lease");
        }else{
            System.out.println("Sorry, you are not eligible for lease");
        }
    }
    public static int getCreditScore(){

        return 800;
    }

    public static void study(){

        System.out.println("Study hard to learn and pass");
    }
   public static String shoppingList(){
        return "apples";

   }

   }

