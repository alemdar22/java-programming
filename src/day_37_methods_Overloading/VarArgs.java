package day_37_methods_Overloading;

public class VarArgs {
    public static void main(String[] args) {
       numbers(5,4);

    }
    public static void numbers(int ... nums){
        int sum=0;
        for(int each:nums){
            sum+=each;
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
