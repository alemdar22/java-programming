package day08_castin_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double price1 = 20.88, price2 = 17.18,price3 = 12.25,balance = 248.25,remainingBalance=0;
        double total =price1+price2+price3;
        remainingBalance= balance-total;
        System.out.println(remainingBalance);
        int newBalance=(int)remainingBalance;// casting yapilmis hali.
        System.out.println(newBalance);

        byte num1 =10;
        short num2 =num1;  // EXPLICIT kucukten buyuge oldugu icin otomatik yapiliyor.
        short num3=1234;
        int num4=num3;
        int num5 =37657876;
        long num6=num5;


    }
}
