package day_38_Methods;

public class MethodCallAnotherMethod {
    public static void main(String[] args) {//
       start();// ucunu birden cagiriyor
        goOn();// ikisini cagiriyor
        end();// sadece kendini cagiriyor

    }
    public static void start(){
        System.out.println("Start");
        goOn();
    }
    public static void goOn(){
        System.out.println("go on");
        end();
    }
    public static void end(){
        System.out.println("end");
    }


}
