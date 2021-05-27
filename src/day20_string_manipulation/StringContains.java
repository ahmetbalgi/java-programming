package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company ="Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else {
            System.out.println("single word company name");
        }
        String etsyTitle ="Wooden spoon | Etsy";
        if(etsyTitle.contains("|")){
            System.out.println("It is in etsyTitle Pass - title check passed");
        }else {
            System.out.println("It is not in etsyTitle Fail - title check failed");
        }

        String firstName = "Ahmet";
        if(firstName.contains("A") && firstName.contains("e")){
            System.out.println("Pass");
        }else {
            System.out.println("Failed");
        }
        firstName = "Nadir";
        if(firstName.contains("a")&& firstName.contains("i")){
            System.out.println("a or i is passed");

        }else {
            System.out.println("nor a or i is present");
        }

        String email = "murodil@cybertek.com";
        if (email.contains("@")&& email.endsWith(".com")){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        if(email.toLowerCase().contains("d")){
            System.out.println("passed d is present");
        }else {
            System.out.println("d is not present");
        }
    }
}
