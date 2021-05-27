package day00MethodsWithVoid;

public class EmailWithMultipleParams {
    public static void main(String[] args) {



        buildEmail("inci","gmail");
        buildEmail("can_","hotmail");
    }
    public static void buildEmail(String name,String domain){
        System.out.println( name+"@"+domain+".com");
    }
}
