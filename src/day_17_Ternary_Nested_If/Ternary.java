package day_17_Ternary_Nested_If;

public class Ternary {
    public static void main(String[] args) {
       // String result =(score>60)? "pass":"fail";
        //int x = (quality.equals("good"))?100 : 0;
        //char grade = (score >90)? 'A' : 'B';


        int score1 = 75;
        String result1 =(score1>75) ? "pass" : "fail";
        System.out.println(result1);

        String quality = "good";
        int rating = quality.equals("good") ? 100 : 10;
        System.out.println("quality is "+quality);

        int score2 =100;
        char grade = (score2 > 90)? 'A' : 'B';
        System.out.println("grade is "+grade);


    }
}
