package day_35_MethodsWithParameters;

public class MethodWithStringParameter {
    public static void main(String[] args) {
        greetByName("Murodil");
        greetByName("Mahmut");
        String name="Berk";
        greetByName(name);


    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+" how are you today?");
    }

}
