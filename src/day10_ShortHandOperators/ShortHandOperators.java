package day10_ShortHandOperators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        cars = cars+2;
        System.out.println(cars);
        cars+=3;
        System.out.println(cars);
        cars-=2;
        System.out.println(cars);
        int parkingLotTotal;


        int electricCars =13;
        //parkingLotTotal=cars+electricCars;
        cars +=electricCars;
        //System.out.println(parkingLotTotal);
        System.out.println(cars);

        String word ="Java";
        System.out.println("Word = "+word);
        word = word+" programming";
        System.out.println(word);
        word+= " is fun";
        System.out.println(word);

        String selenium = " but Selenium is more fun";
        word+= selenium;
        System.out.println(word);
        word += 12345;
        System.out.println(word);
        char letter = 'A';
        System.out.println("Letter = "+letter);
        letter+=3;
        System.out.println(letter);
        letter+=1;
        System.out.println(letter);

        double parkingFee = 7.50;
        System.out.println("Parking fee "+parkingFee);
        parkingFee/=2;
        System.out.println("Early bird parking fee = "+parkingFee);
        parkingFee-=parkingFee;
        System.out.println("Weekend parking fee = "+parkingFee);


    }
}
