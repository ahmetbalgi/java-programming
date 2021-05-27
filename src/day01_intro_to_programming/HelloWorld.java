package day01_intro_to_programming;

import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the text:");
//        String name = scan.nextLine();
//        int n = name.length();
//        System.out.println("Length is: "+n);

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        boolean oddLength = word.length() % 2 != 0 && word.length() >= 3;
        boolean singleLetter = word.length() == 1;
        boolean evenLength = word.length() % 2 == 0 && word.length() >= 4;
        boolean twoLetter = word.length() == 2;
        int middleLetter = word.length() / 2;

        if (oddLength) {
            System.out.print(word.charAt(middleLetter));
        } else if (singleLetter) {
            System.out.print(word + word + word);
        } else if (evenLength) {
            System.out.print("" + word.charAt(middleLetter - 1) + word.charAt(middleLetter));
        } else if (twoLetter) {
            System.out.print(word + word);
        }
    }


}
