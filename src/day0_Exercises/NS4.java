package day0_Exercises;

public class NS4 {
    public static void main(String[] args) {
        int age = 60;
        if(age < 55){
            System.out.println("young");
        }else{
            System.out.println("old");
            if(age >75){
                System.out.println("very old");
            }else{
                System.out.println("you are OK");
            }
        }
    }
}
