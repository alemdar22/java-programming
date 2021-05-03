package Day_25_Loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars =0;stars<=3;stars++){
            System.out.print("* ");
        }
        System.out.println();

        String myStars="";
        for (int n =1;n<=5;n++){
            myStars+="* ";
            System.out.println(myStars);
        }
        //System.out.println(myStars);
    }
}
