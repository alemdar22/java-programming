package day_18_conditionsPractice;

public class AuntenticationNestedIf {
    public static void main(String[] args) {
        int inputSSN = 12345;
        int inputPinCode = 2233;

        int actualSSN =1234;
        int actualPinCode=2233;

        if (inputPinCode==actualPinCode && inputSSN==actualSSN){
            System.out.println("Authentication successful");

         }else{
            System.out.println("Authentication failed");
                if(actualPinCode!=inputPinCode){
                System.out.println("Pin code does not match");
                }else{
                    System.out.println("SSN does not match");
                }
        }
    }
}
