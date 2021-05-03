package day0_Exercises;

public class NestedIf3 {
    public static void main(String[] args) {
        int temperature = 78;
        if (temperature < 50) {
            System.out.println("Stay home");
        } else{
            System.out.println("Go out");
            if(temperature>55){
                System.out.println("Go run");
            }else{
                System.out.println(" it is raining");
            }




        }
    }
}
