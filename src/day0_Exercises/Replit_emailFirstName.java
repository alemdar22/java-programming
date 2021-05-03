package day0_Exercises;

public class Replit_emailFirstName {
    public static void main(String[] args) {
        String email = "craig_federighi@apple.com";

        System.out.println("First name: "+email.substring(0,email.indexOf("_")).substring(0,1).toUpperCase()+email.substring(1,
                email.indexOf("_")));
        System.out.println("Last name: "+email.substring(email.indexOf("_")+1,email.indexOf("@")).toUpperCase());
        System.out.println("Domain: "+email.substring(email.indexOf("@")+1,email.indexOf(".")));
}
}
//System.out.println(city.substring(0,1).toUpperCase()+city.substring(1))
