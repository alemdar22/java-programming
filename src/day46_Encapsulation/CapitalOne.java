package day46_Encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account1=new CheckingAccount();
        account1.setAccountNumber(76839375638399L);
        account1.setBalance(234.56);
        account1.setAccountHolder("Ben Ten");
        account1.setChecking("checking");

        System.out.println(account1.toString());

    }
}
