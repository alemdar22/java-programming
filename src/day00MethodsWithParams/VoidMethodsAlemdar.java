package day00MethodsWithParams;

public class VoidMethodsAlemdar {
    public static void main(String[] args) {
     printAtoZ();

        for (int i = 0; i <=5 ; i++) {
            printAtoZ();

        }

    }
    public static void printAtoZ(){
        for(char i = 'A' ;i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();


    }

}
