package day_35_MethodsWithParameters;

public class Email {
    public static void main(String[] args) {
        buildEmail("saim","huhu");
        buildEmail("ali","verizon");
        buildEmail("Ali KLO","hoover");
    }
    public static void buildEmail(String name,String domain){
        name=name.replace(" ","_").toLowerCase();
        System.out.println(name+"@"+domain.toLowerCase()+".com  ");

    }
}
