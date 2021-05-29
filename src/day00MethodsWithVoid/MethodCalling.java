package day00MethodsWithVoid;

public class MethodCalling {
    public static void main(String[] args) {
    showMessage();


    for (int i =0;i<=100;i++){
        System.out.print(i+" ");
        showMessage();
    }

    }
    public static void showMessage(){
        System.out.println("helloooo");
    }
}