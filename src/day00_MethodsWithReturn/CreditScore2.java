package day00_MethodsWithReturn;

public class CreditScore2 {
    public static void main(String[] args) {
        checckEligible(700);
        checckEligible(600);

        System.out.println(score());

        int totalScore=score();// assign ettik.
        System.out.println(totalScore);


    }
    public static void checckEligible(int credittScore){
        if(credittScore>650){
            System.out.println("eligible");
        }else{
            System.out.println("not");
        }
    }

    public static int score(){
        return 700;
    }
}
