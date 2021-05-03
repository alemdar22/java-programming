package day_19_Strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Java";
        System.out.println(word.toLowerCase());
        String word1="selenium";
        System.out.println(word1.toUpperCase());

        String str ="CyberTek";
        System.out.println(str.toLowerCase()); // hepsi kucuk harf

        System.out.println(str.toUpperCase()); // hepsi buyuk harf

        str=str.toLowerCase(); //str yeniden assign edildi kucuk harf oldu.
        System.out.println(str);

        String company ="amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company is "+company.toUpperCase());

        company= company.toUpperCase(); // re-assigned
        System.out.println("Company re-assigned to upper case : "+company);
    }
}
