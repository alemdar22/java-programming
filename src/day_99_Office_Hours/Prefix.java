package day_99_Office_Hours;

public class Prefix {
    public static void main(String[] args) {
        String str="abXYabc";
        int n=2;

        String prefix=str.substring(0,n);
        String remaining = str.substring(n);

        System.out.println(remaining.contains(prefix));



    }
}
