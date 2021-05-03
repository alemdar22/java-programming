package day_36_methods_with_Return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        String name=fullName();
        System.out.println("name "+name);
        System.out.println(isMarried());
        boolean married=isMarried();
        System.out.println(" is married? "+married);
        System.out.println(getAge());
        int age=getAge();
        System.out.println("age "+age);
        System.out.println(getRandomYear());
        int yearRandom=getRandomYear();
        System.out.println(yearRandom);
        System.out.println(getRandomYear());

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }



    }

    public static String fullName(){
        //System.out.println("inside fullname method ");//buraya da print mesaji yazilabilir.
        return "Mike Smith";
    }
    public static boolean isMarried(){

        return false;
    }
    public static int getAge(){
        int age = 35;
       // return 35;
        return age; //35 age olarak assign edildi, variable return edilecek.
    }
    public static int getRandomYear(){
        Random random=new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }
}
