package day0_Exercises;

public class VoidMethodNoParam {
    public static void main(String[] args) {
        myMethod();
        for (int i = 0 ; i<=10;i++){
            System.out.print(i+" ");
            myMethod();
        }

    }
    public static void myMethod(){

        System.out.println("How are you?");
    }
}
