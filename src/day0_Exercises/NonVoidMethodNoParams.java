package day0_Exercises;

public class NonVoidMethodNoParams {
    public static void main(String[] args) {
        System.out.println(nums());
        int newNum =nums();
        if(newNum<500){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
    public static int nums(){
        return 900;
    }
}
