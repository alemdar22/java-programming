package day0_Exercises;

public class MethodsExercise {
    public static void main(String[] args) {
       morningMessage();
       greeting("helloooo");
        System.out.println(num());
        System.out.println(carBrand("honda","BMW"));
    }
    public static void morningMessage(){
        System.out.println("good morning");
    }
    public static void greeting(String message){
        System.out.println(message);
    }
    public static int num(){
        return 900;
    }
    public static String carBrand(String car1,String car2){
        String cars= car1+" "+car2;
        return cars;
    }
}