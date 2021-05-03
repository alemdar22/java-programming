package day0_Exercises;

public class April20ArraysWithLoop {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 100) {
                System.out.print(prices[i] + " ");
            }
        }
        System.out.println();

        for (double each : prices) {
            if (each > 100) {
                System.out.print(each + " ");
            }
        }
        System.out.println();
        for (double each : prices) {
            if (each >= 50 && each <= 90) {
                System.out.println(each);
            }
        }
        System.out.println();
        int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 50) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println();
        int count = 0;
        for (double each : prices) {
            if (each > 50) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
        for(String each:countries){
            if(each.length()>7){
                System.out.println(each);
            }
        }
    }
}