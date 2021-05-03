package day_35_MethodsWithParameters;

public class VoidMethods {
    public static void main(String[] args) {
        printAToZ();
        displayUSFlag();
        displayUSFlag();


        for (int i =0;i<=10;i++){
            System.out.print(i+" ");
            printAToZ();
        }
    }
    public static void printAToZ(){
        for (char  i ='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void displayUSFlag(){
        System.out.println("--------------Flag of USA--------------------------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
    }

