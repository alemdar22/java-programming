package day_24_Loops;

public class Mangos {
    public static void main(String[] args) {
        int mangos = 1;

        while (mangos <= 10) {
            System.out.println("Eat mango " + mangos + "");
            mangos++;
        }
        System.out.println();
        int books=5;
        do{
            System.out.println("I need a book "+books);
            books++;
        }while(books<=10);
    }

}