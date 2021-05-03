package day_36_methods_with_Return;

public class GetCrediScore {
    public static void main(String[] args) {
        System.out.println(getCreditScore());
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(greeting());
        String message=greeting();
        System.out.println(message);
        }
        public static int getCreditScore(){

        return 800;
    }
    public static String greeting(){
        return "Hello Student";
    }
}
