package day_19_Strings;

public class LengthOfString {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.length());
        String name = "Alemdar";
        System.out.println(name.length());
        System.out.println("Count : "+name.length());

        System.out.println("Count: "+"bethesda maryland".length());
        int count=name.length();
        System.out.println(count);

        String password= "ab123";
        if(password.length()>=6){
            System.out.println("valid password");
        }else{
            System.out.println("invalid password");
        }

        String word1="USA";
        if(word1.equals(word1.toUpperCase())){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
