package day35_methods_with_param;

import java.util.Locale;

public class buildEmail {
    public static void main(String[] args) {
        email("ahmet","wholefoods");
    }
    public static void email(String name,String domain){
        name=name.replace(" ","_").toLowerCase();
        domain=domain.toLowerCase();
        String emailName = name + "@" + domain + ".com";
        System.out.println(emailName);
    }
}
