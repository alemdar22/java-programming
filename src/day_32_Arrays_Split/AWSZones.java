package day_32_Arrays_Split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        String [] zonesArray=zones.split(",");
        for(String each:zonesArray){
            System.out.println(each);
            System.out.println(app+" "+each);
            System.out.println("Deployment completed for "+each);
        }
        System.out.println("All deployments completed");



    }
}
