package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "virginia";
        System.out.println(city.equals("virginia"));
        System.out.println(city.equals("Virginia"));
        System.out.println(city.equals("virginia "));
        //EqualIgnorecase  example
        System.out.println(city.equalsIgnoreCase("Virginia"));
        System.out.println(city.equalsIgnoreCase("virginia"));
        System.out.println(city.equalsIgnoreCase("VirgiNiA"));
        System.out.println(city.equalsIgnoreCase("Virrginia"));
        System.out.println(city.equalsIgnoreCase("Virginia "));

        if(city.equals("virginia")){
            System.out.println("system equal true");
        }else {
            System.out.println("system equal false");
        }
        if(city.equalsIgnoreCase("Virginia")){
            System.out.println("system equal true");
        }else {
            System.out.println("system equal false");
        }

    }
}
