package day_22_StringManipulation_Methods;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java,html,css,selenium,testng,maven,cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        System.out.println(technologies.indexOf("selenium"));
        System.out.println(technologies.indexOf("maven"));//ilk harfin lokasyonunu verir
        System.out.println(technologies.indexOf("api"));

        if (technologies.indexOf("maven")>-1) {

            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}