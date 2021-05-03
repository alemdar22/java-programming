package day_30_Arrays;

public class ArrayLoopWithConditions {
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

        for (double each : prices) {
            if (each > 100.0) {
                System.out.print(each + " ");
            }
        }
        System.out.println();
        for (double each : prices) {
            if (each >= 10 && each <= 70) {
                System.out.print(each + " ");
            }
        }
        System.out.println();
        int count = 0;

        for (double eachPrice : prices) {
            if (eachPrice > 50) {
                count++;
            }
        }
        System.out.println(count + " prices are more than $50");
        System.out.println();

        for( String names:countries ){
            if (names.length()>=7){
                System.out.print(names+" ");
            }
        }
        for(double newEach:prices){
            if(newEach>150){
                System.out.println("prices over 150 : "+newEach);
            }
        }

        for(double each: prices){
            if(each>50 && each <=100){
                System.out.print(each+" ");
            }
        }
        System.out.println();
        int counter=0;
        for( double each:prices){
            if(each>=10 && each<=100){

                counter++;
            }
        }
        System.out.println(counter);

        for( String each : countries){
            if(each.length()>8){
                System.out.println(each);
            }
        }

        System.out.println(countries[0]+" "+countries[1]);

        for (int i = 0; i< countries.length;i++){
            System.out.println(countries[i]+" "+countries[i+1]+" "+countries[i+2]);
        }


    }
}


