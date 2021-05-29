package day00MethodsWithParams;

public class VoidMethodPractise {
    public static void main(String[] args) {
        loggIn("alemdar","abc123");
        loggIn("al","aaa");

        System.out.println(loggInReturn("aa","bb"));

        boolean isLoggInSuccess=loggInReturn("han","pam");//assign ettik
        System.out.println(isLoggInSuccess);

    }
    public static void loggIn(String username,String password){
        String secretUsername="alemdar";
        String secretPassword="abc123";
        if(secretUsername.equals(username) && (secretPassword.equals(password))){
            System.out.println("Match");
        }else{
            System.out.println("mismatch");
        }
    }
    public static boolean loggInReturn(String username,String password){
        String secretUsername="alemdar";
        String secretPassword="abc123";
        if(secretUsername.equals(username) && (secretPassword.equals(password))){
           return true;
    }else {
            return false;
        }

    }
}
