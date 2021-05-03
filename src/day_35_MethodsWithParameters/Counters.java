package day_35_MethodsWithParameters;

import java.nio.charset.StandardCharsets;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(10);
        int num= 123;
        count(num);
        String word= "wooden spoon";
        count(word.length()); //yukariyi sayacak lenght e koyacak sonuc 12
        String name="alemdar";//length 7,
        count(name.length()); //0-dan 7'ye yazacak'
        printAge(1969);

        int birthYear=2000;
        printAge(birthYear);
    }
    public static void count(int num){
        for (int i =0;i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printAge(int year){
        int currentYear=2021;
        int age = currentYear-year;
        System.out.println("Birth year : "+year+" Age : "+age);
    }
    }


