package day_33_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreFound();


    }
    public static void openBrowser(){
        System.out.println("Open browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to Etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Search for wooden spoon");
    }
    public static void verifyResultsAreFound(){
        System.out.println("wooden spoon is there");
    }
}
