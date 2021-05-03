package day_32_Arrays_Split;
import java.util.*;
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        double maxPrice = prices[0]; // ilk index in en pahali oldugunu varsayiyoruz
        int indexOfMaxPrice = 0;// gene varsayim
        double minimumPrice =prices[0];
        int indexOfMinimumPrice=0;

        for(int i = 0 ; i<prices.length;i++){
            if(prices[i]<minimumPrice){
                minimumPrice=prices[i];
                indexOfMinimumPrice=i;
               // System.out.println(minimumPrice[i]);
            }
        }
        System.out.println(minimumPrice);
        System.out.println("index of minimum number is " +indexOfMinimumPrice);
        System.out.println();

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
            //System.out.println(prices[i]);

            System.out.println(Arrays.toString(items));
            System.out.println(Arrays.toString(prices));
            System.out.println(Arrays.toString(itemIDs));

        }
        System.out.println(maxPrice);
        System.out.println(indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice]);

    }
    }



