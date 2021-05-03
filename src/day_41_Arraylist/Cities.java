package day_41_Arraylist;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        /** add, get, size,remove,clear,contains,isEmpty*/
        ArrayList<String> cities= new ArrayList<>();
        // adding values to arrayList..add methods
        cities.add("D.C");
        cities.add("Bethesda");
        cities.add("L.A");
        cities.add("Istanbul");
        //adding Boston with index number
        cities.add(0,"Boston");
        System.out.println(cities);
        // get method to print with index number
        System.out.println(cities.get(0));
        //last element printing
        System.out.println(cities.get(cities.size()-1));
        //print count of items,length
        System.out.println(cities.size());
        //for loop
        for (int i = 0;i<cities.size();i++){
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();

        for(String each:cities){
            System.out.print(each+"-");
        }
        System.out.println();
        // remove item... using index, using object
        cities.remove(0);
        // remove by object
        cities.remove("D.C");
        // after remove
        System.out.println(cities);

        // deleting all elements using clear method

        cities.clear();// checking if is totally deleted
        System.out.println(cities);
        if(cities.isEmpty()){
            System.out.println(true);
        }
        System.out.println("Victor");



    }


}
