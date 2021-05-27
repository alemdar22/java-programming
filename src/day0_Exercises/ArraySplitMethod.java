package day0_Exercises;

import java.util.Arrays;

public class ArraySplitMethod {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        //System.out.println(Arrays.toString(items));
        int indexOfGloves=-1; // listede yok diye kotu senaryo basladik
       for (int i =0;i<items.length;i++){
           if(items[i].equals("Gloves")){

               System.out.println(i);
           }

       }

        System.out.println();

       for(int i = 0;i<items.length;i++){
           if(items[i].equals("iPad")){
               System.out.println(i);
           }
       }
       for (int i=0;i<items.length;i++)
           System.out.println();

       for (int i=0;i<items.length;i++){
           if(items[i].equals("Airpods")){
               System.out.println(i);
           }
       }

        for (int i = 0; i <items.length ; i++) {
            if(items[i].equalsIgnoreCase("gloves")){
                System.out.println(i);
            }
        }


        for (int i =0;i<items.length;i++){
            if(items[i].equals("Gloves")){
                System.out.println(i);
                break;
            }
        }
        for (int i = 0;i<prices.length;i++){
            if(prices[i]==9.99){
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]==39.99){
                System.out.println(i);
                break;
            }
        }

        boolean iPadExists=false;

        for(String each:items){
            if(items.equals("iPad")){
                iPadExists=true;
                break;
            }

        }
        System.out.println(iPadExists);

        System.out.println();

        for (int i=0;i<items.length;i++){
            System.out.println("item "+items[i]+" - "+"price "+prices[i]+" - "+"item id "+itemIDs[i]);
        }
    }
}
