package Day_25_Loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        int oddNum = 0;
        int evenNum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();
        for (int j =0;j<=100;j++){
            if(j%2!=0){
                System.out.print(j+" ");
                j++;
            }
        }
        System.out.println();
        for (int n =1;n<=20;n++){
            System.out.print(n);
            n+=4;
        }
    }
}




