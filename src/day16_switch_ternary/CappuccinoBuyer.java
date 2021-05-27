package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String  size ="tall";
        double price = 0;
        int calories = 0;
        switch (size){
            case "tall":
                System.out.println("tall cappuccino please");
                price=3.69;
                calories=90;
               
                break;
            case "grade":
                System.out.println("Grade cappuccino please");
                price=3.99;
                calories=120;
              
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price=4.29;
                calories=150;
                
                break;
            default:
                System.out.println("we don't serve that size of cappuccino");
                
                break;
               
        }
        System.out.println("total: " + price);
        System.out.println("total: " + calories);
    }
}
