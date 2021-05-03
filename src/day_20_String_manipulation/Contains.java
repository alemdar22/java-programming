package day_20_String_manipulation;

import java.util.Locale;

public class Contains {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.contains("v"));
        System.out.println(word.contains("jav"));
        System.out.println(word.contains("jv")); // false verir. iki harfi yanyana arar.
        System.out.println(word.contains("Ja"));

        String company ="Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("pital"));

        if(company.contains(" ")){
            System.out.println("multiple words company");
        }else{
            System.out.println("single word company");
        }
        String etsyTitle="Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")){
            System.out.println("Title check passed");
        }else{
            System.out.println("failed");
        }
        String name1="alemdar";
        if(name1.contains("a")&&name1.contains("e")){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        String email="alemdarsu@gmail.com";
        System.out.println(email.contains("@")&&email.endsWith(".com"));

        if(email.contains("@")&&email.endsWith(".com")){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        if(email.toLowerCase().contains("d")){ //  buyuk kucuk harf farki olmadan
            System.out.println("pass d is there");
        }

    }
}
