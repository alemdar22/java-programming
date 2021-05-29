package day00MethodsWithVoid;

public class EtsySearchAlemdar {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsy();
        searchWoodenSpoon();
        verifyResults();

    }
    public static void openBrowser(){
        System.out.println("open your browser");
    }
    public static void navigateToEtsy(){
        System.out.println("go to www.etsy.com");
    }
    public static void searchWoodenSpoon(){
        System.out.println("input wooden spoon");
    }
    public static void verifyResults(){
        System.out.println("check results displaying");
    }
}
