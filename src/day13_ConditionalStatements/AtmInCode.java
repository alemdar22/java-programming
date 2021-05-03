package day13_ConditionalStatements;

public class AtmInCode {
    public static void main(String[] args) {
        int secretPincode=1234;
        int inputCode=1237;
        System.out.println("Welcome to TD Bank ATM");

        if(secretPincode==inputCode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw,check balance,deposit.");
        }else{
            System.out.println("Incorrect pincode! "+inputCode);
            System.out.println("Please try again");
        }
    }
}
