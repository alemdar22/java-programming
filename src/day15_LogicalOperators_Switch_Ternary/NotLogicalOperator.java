package day15_LogicalOperators_Switch_Ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println(!true);
        System.out.println(!false);
        int age = 2;
        if (!(age>7)){
            System.out.println("child seat required");
        }else{
            System.out.println("it is ok");
        }
        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed){
            System.out.println("Smoking is not allowed");
        }
        boolean isAffordable = true;
        if(!isAffordable){
            System.out.println("Not affordable");
        }

        String carModel="Tesla";

        if(!carModel.equals("Tesla")){
            System.out.println("Not interested");
        }

        String secretPassword ="ABA123";
        String inputPassword = "aaa111";

        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");
        }
    }
}
