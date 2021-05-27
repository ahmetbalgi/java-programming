package day17_ternary_nested_conditions;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you like drink or snack");
        String selection = scan.next();
        //String selection = "drink";
        //String drink = "tea";
        //String snack = "chips";
        if (selection.equals("drink")) {
            System.out.println("Do you like tea or coffee");
            String drink = scan.next();
            if (drink.equals("tea")) {

            } else {
                System.out.println("coffee");
            }
        }else {
            if(selection.equals("snack")) {
                System.out.println("Do you like chips or coke");
                String snack = scan.next();
            if (snack.equals("chips")) {
                System.out.println("chips is selected");
            } else {
                System.out.println("coke");
            }

        }
        }
    }
}
