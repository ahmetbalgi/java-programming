package day13_conditional_stattements;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        double bonus = 0;
        double salesAmount = src.nextDouble();
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus");
            bonus = 50;
            // System.out.println("assign bonus " + bonus);
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
            // System.out.println("assign bonus " + bonus);
        }
        System.out.println("Your total bonus " + bonus);

    }
}
