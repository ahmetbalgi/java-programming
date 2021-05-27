package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("-- Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }
    public static void openBrowser(){
        System.out.println("Launching chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate Etsy URL https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Search for thw wooden spoon");
        System.out.println("Type 'Wooden Spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Pass: Search result are  successfully displayed");
    }
}
