package day_38_Methods;

public class StringUtils {
    public static void main(String[] args) {
        isNullOrEmpty("");
        isNullOrEmpty(null);
        String word=null;
        System.out.println(word.toUpperCase());// yazacak birsey olmadigindan exception mesaji verir

    }
    public static void isNullOrEmpty(String str){
        if(str==null || str.isEmpty()){  // return (str==null || str.empty()) >> diger yolu
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void isPalindrome(String str){

    }
}
