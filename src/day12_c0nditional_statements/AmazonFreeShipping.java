package day12_c0nditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter total price");
        double price =src.nextDouble();
        if (price>25){
            System.out.println("Free Shipping Eligible your order total is: "+price);
        }else {
            System.out.println("No free shipping your order total is: "+price);
        }
        System.out.println("Thank you for shopping with Amazon");

    }
}
