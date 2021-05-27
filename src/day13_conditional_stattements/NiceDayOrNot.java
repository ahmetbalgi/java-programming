package day13_conditional_stattements;

import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int temp = src.nextInt();
        if (temp >= 70){
            System.out.println("It is a beautiful day");
            System.out.println("Lets code java!");
        }else {
            System.out.println("It is kind of cold today ");
            System.out.println("Lets stay home and code java!");
        }
    }
}
