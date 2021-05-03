package day_23_String__Manipulation;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender:[Nadir] From Number<222333444> Message:{Hello, lets code some java}";
        int first= message.indexOf("[");
        int second = message.indexOf("]");
        String sender = message.substring((first)+1,(second));
        System.out.println(sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println(mobile);

        String messageWord = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println(messageWord);

    }
}
