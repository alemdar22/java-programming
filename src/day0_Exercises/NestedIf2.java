package day0_Exercises;

public class NestedIf2 {
    public static void main(String[] args) {
        int itemPrice = 15;
        boolean isPrimeMember=true;
        if(!isPrimeMember) {
            System.out.println("eligible for free shipping");
        }else{
                if(itemPrice>=25){
                    System.out.println("regular 2 day free shipping");

                }else{
                    System.out.println("not eligible for free. $10 shipping fee.");
                }
            }
        }
    }

