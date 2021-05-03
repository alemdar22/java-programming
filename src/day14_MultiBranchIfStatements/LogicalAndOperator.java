package day14_MultiBranchIfStatements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println(10>5 && 9==9);

        int apples =8;
        int oranges=10;

        if(apples>5&&oranges==10){
            System.out.println("list is ok");
        }else{
            System.out.println("Go shopping");
        }
    }
}
