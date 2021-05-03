package day_19_Strings;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String country ="SERBIA";
        if(country.equals(country.toUpperCase())){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
