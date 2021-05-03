package day12_boolean_conditionalStatements;

public class IfElseStatements {
    public static void main(String[] args) {
      if(10>5){
          System.out.println("Condition is true");
      }else{
          System.out.println("Condition is false");
      }
      int count = 25;
      if(count>30){
          System.out.println("pass");
      }else{
          System.out.println("fail");
      }
      int age = 25;
      if(age>=18){
          System.out.println("Able to vote");
          System.out.println("18 is minimum age to vote");
      }else{
          System.out.println("Too young to vote");
      }
    }
}
