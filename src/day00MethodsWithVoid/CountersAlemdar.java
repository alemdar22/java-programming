package day00MethodsWithVoid;

public class CountersAlemdar {
    public static void main(String[] args) {
        count(10);

        count(5);

        int number =999;
        count(number);

        printAge(2011);

        printAge(1990);

    }
    public static void count(int num){
        for(int i = 0 ; i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();

    }

    public static void printAge(int year){
        int age=2021-year;
        System.out.println("Birth year is "+year+" and age is "+age);

    }
}
