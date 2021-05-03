package day_37_methods_Overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        logInVoid("CybertekStudent","abc123");
        logInVoid("CybertekStudent","ajkn22");
        logInVoid("klomnk","abc123");
        System.out.println(login("alemdar1","aaa111"));
        if(login("alemdar1","aaa111")){
            System.out.println("Welcome, log in succesful");
        }else{
            System.out.println("not succesful");
        }
        boolean isLoginSuccess=login("Mahmut","897yyy");// false degeri verdi
        System.out.println(isLoginSuccess);
        if(login("Mahmut","897yyy")){ // parantez ici false
            System.out.println("LOG In YES");
        }else{
            System.out.println("LOG IN NO");
        }


    }
    public static void logInVoid( String userName, String passWord){
        String secretUserName="CybertekStudent";
       String secretPassword ="abc123";
       if(userName.equalsIgnoreCase(secretUserName)&& passWord.equals(secretPassword)){
            System.out.println("Log in successful");
        }else{
           System.out.println("Log in failed");
       }
    }
    public static boolean login(String userName,String password){
        String secretUserName="alemdar1";
        String secretPassword="aaa111";
        if(userName.equalsIgnoreCase(secretUserName)&&password.equals(secretPassword)){
            return true;
        }else{
            return false;
        }

    }
       }


