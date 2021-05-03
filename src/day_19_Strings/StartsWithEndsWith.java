package day_19_Strings;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String word ="selenium";
        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("sel"));

        String str = "carpet";
        System.out.println(str.endsWith("pet"));

        String str1="intellij ide";
        if(word.startsWith("sel")){
            System.out.println("word is "+word);
        }
        if(str.endsWith("pet")){
            System.out.println("str is "+str);
        }

        String firstName ="Sr. Alemdar";
        if(firstName.startsWith("Mr.")){
            System.out.println("man");
        }else{
            if(firstName.startsWith("Dr")){
                System.out.println("doctor");
            }else if(firstName.startsWith("Mrs.")){
                System.out.println("woman");
            }else if(firstName.startsWith("Ms.")){
                System.out.println("single woman");
            }else if(firstName.startsWith("Sr")){
                System.out.println("senior");
            }
        }

    }
}
