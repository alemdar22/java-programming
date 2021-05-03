package Day_25_Loops;

public class SumOfNuumbers {
    public static void main(String[] args) {
        int sum=0;

        int total =0;

        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        for(int j =1;j<=10;j++){
            total+=j;
        }
        System.out.println(total);
    }
}
