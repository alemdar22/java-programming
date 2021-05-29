package day0_Exercises;

public class Pr_Constructor {


    public Pr_Constructor(){
        System.out.println("no params");
    }
    public Pr_Constructor(int model){
        System.out.println(" car model "+ model);
    }
    public Pr_Constructor (String carBrand){
        System.out.println("car brand "+carBrand);
    }
    public Pr_Constructor(String carBrand,int model){
        System.out.println(carBrand+" "+model);
    }

}
