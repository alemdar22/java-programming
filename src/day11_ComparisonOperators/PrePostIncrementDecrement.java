package day11_ComparisonOperators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =++num1;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 4;
        int num4 = num3++;
        System.out.println(num3);
        System.out.println(num4);
        int aa=50;
        int bb=22;
        int cc = aa++ + ++bb;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
    }
}
