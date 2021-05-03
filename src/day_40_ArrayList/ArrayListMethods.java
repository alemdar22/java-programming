package day_40_ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList=  new ArrayList<>();
        System.out.println(shoppingList.size());
        System.out.println(shoppingList.isEmpty());
        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("Not empty");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("Not empty");
        }

        int count=0;
        count=shoppingList.size();
        System.out.println(count);

        System.out.println(shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("shoes in the list");
        }else{
            System.out.println("No shoes, sorry");
        }
        System.out.println();
        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        shoppingList.clear();
        System.out.println(shoppingList+" shopping finished");


    }
}
