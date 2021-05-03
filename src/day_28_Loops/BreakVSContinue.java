package day_28_Loops;

public class BreakVSContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {

                break;
            }
        }
        for(int j =1;j<=5;j++){
            if(j==2||j==4){
                continue;
            }
            System.out.println(j);
        }
    }
    }

