package day_22_StringManipulation_Methods;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result ="result count:12345";
        System.out.println(result.substring(result.indexOf("1")));

        String today ="i learned [java] today";
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}
