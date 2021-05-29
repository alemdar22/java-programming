package day00MethodsWithParams;

public class MethodOverLoadingAlemdar {
    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum("alem","sin"));

    }
    public static int sum(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }
    public static double sum(double num3,double num4){
        double sum=num3+num4;
        return sum;
    }
    public static String sum(String word1,String word2){
        String sum=word1+word2;
        return sum;
    }

}
