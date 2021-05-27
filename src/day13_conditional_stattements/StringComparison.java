package day13_conditional_stattements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "los Angeles";
        if (city.equals("los Angeles")){
            System.out.println("It is LA");
        }else {
            System.out.println("it is not LA");
        }
        String weather = "sunny";
        // if (weather == "sunny") { <-- it works, not error, but Avoid
        if (weather.equals("sunny")) {
            System.out.println("Lets go out and code java!");
        } else {
            System.out.println("Lets stay indoors, and code java!");
        }
    }
}
