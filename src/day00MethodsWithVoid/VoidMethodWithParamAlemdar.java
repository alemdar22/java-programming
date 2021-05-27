package day00MethodsWithVoid;

public class VoidMethodWithParamAlemdar {
    public static void main(String[] args) {
        num(5);

        word("be well");
        list(12);

        list(33);
        int count =66;
        list(count);

        greeetByName("Max");
        String name1="Bob";
        greeetByName(name1);


    }
    public static void num(int a){
        System.out.println(a);
    }
    public static void word(String niceWords){
        System.out.println(niceWords);
        if(niceWords.equals("be well")){
            System.out.println(true);
        }
    }
    public static void list(int num1){
        System.out.println(num1);
    }

    public static void greeetByName(String name){
        System.out.println("Hello "+name+" how are you?");
    }
}
