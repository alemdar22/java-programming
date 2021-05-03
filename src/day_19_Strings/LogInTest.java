package day_19_Strings;

public class LogInTest {
    public static void main(String[] args) {
        String expectedUserName="cybertek";
        String expectedPassword="Abc123";
        String userName="CYBERTEK";
        String password="Abc123";

        if(expectedUserName.equalsIgnoreCase(userName)&& password.equals(expectedPassword)){
            System.out.println("Pass-log in successful");
        }else{
            if(expectedUserName!=userName){
                System.out.println("user name failed");
            }else{
                System.out.println("password failed");
            }
        } //else if(expectedUserName!=userName){
            //System.out.println("Incorrect Username");


        }
    }

