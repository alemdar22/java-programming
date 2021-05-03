package day_39_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(40,20));
        System.out.println(Integer.min(32,9));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.max(2,8.9));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('L'));
        System.out.println(Character.toUpperCase('p'));

        char let = 'A';
        if(Character.isUpperCase(let)){
            System.out.println(true);
        }
        String word = "Java Is Fun";
        for(int i =0;i<word.length();i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }


        }
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        }





    }
