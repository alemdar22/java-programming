package day_32_Arrays_Split;

public class ReplitExercise {
    public static void main(String[] args) {
        String email = "alemdar@xmail.com";
        String[] emailArray = email.split("@");
        String emailID = emailArray[0];
        String domain = emailArray[1];
        System.out.println(emailID);
        System.out.println(domain);

        String email1 = "huhu@gmail.com";




    }
}
