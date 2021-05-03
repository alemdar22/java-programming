package day0_Exercises;

public class SubstringExercise {
    public static void main(String[] args) {
        String message = "Sender:[Nadir] From Number<222333444> Message:{Hello, lets code some java}";

        System.out.println(message.substring(message.indexOf("]")+2,message.indexOf("<")));
        System.out.println(message.replace("Nadir","Murodil"));
        System.out.println(message.substring(message.indexOf(":")+1,message.indexOf("]")+1));

        String email ="ali_ak@gmail.com";
        int dash = email.indexOf("_");
        int at = email.indexOf("@");
        String first =email.substring(0,dash);
        String last=email.substring(dash+1,at);
        System.out.println(first);
        System.out.println(last);
        ;
        //System.out.println(email.substring(dash));

    }
}
