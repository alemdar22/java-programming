package day00_MethodsWithReturn;

public class CreditScoreAlemdar {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(765);

        System.out.println(getCreditScore());

    }
    public static void checkEligible(int creditScore){
        if(creditScore>700){
            System.out.println("eligible for loan");
        }else{
            System.out.println("not eligible");
        }
    }

    public static int getCreditScore (){

        System.out.println("hu");// buraya print statement yazabilirsin
        return 800;
    }
}
