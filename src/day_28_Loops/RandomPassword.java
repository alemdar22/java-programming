package day_28_Loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source="ABCDEFGHIJKLMNOPQRSTUVXYZabcdefghijklmnopqrstuxyz &^%$*($#@";
        String password="";

        Random random= new Random();
        random.nextInt();//20  haric random bir sayi verir
        for(int i =1;i<=8;i++){
            //System.out.println(random.nextInt(source.length()));
            System.out.println(source.charAt(random.nextInt(source.length())));
            password+=(source.charAt(random.nextInt(source.length())));// string+char=string
        }
        System.out.println(password);

    }

}
