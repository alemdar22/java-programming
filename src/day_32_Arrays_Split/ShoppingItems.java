package day_32_Arrays_Split;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("----------------find the gloves index  number of items in arrays-------");

        for (int i=0;i<items.length;i++){
            if(items[i].equals("Gloves")){

                System.out.println("Gloves found at index "+i);
                break;
            }
        }
        System.out.println(" set boolean to true if first ipad is found-----------");

        boolean iPadExists = false; // ilk bastan olumsuz value verip bulunca true olacak.
        for (int i = 0;i<items.length;i++){
            if(items[i].equals("iPad")){
                iPadExists=true;
                break;
            }
        }
        System.out.println(iPadExists);

        System.out.println("------print a report of each shopping item------");

        for (int i =0;i<items.length;i++){
            System.out.println(items[i]+" - $"+prices[i]+" - "+" # "+itemIDs[i]);
        }
        System.out.println();
        for (int i = 0; i<items.length;i++){

        }
    }
    }

