package day01_intro_to_programming;

import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        System.out.println("Hello my name is Ahmet, I live in woodbridge");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
       // String word = "loubn";
        if (word.length() >= 3) {
            if (word.length() % 2 == 1) {
                int num = word.length() / 2;
                System.out.println(word.charAt(num));

            } else if (word.length() <= 1) {
                System.out.print(word.charAt(0));
                System.out.print(word.charAt(0));
                System.out.print(word.charAt(0));

            } else if (word.length() >= 4) {
                if (word.length() % 2 == 0) {
                    int num = word.length() / 2;
                    //System.out.println(word.charAt(num));
                    System.out.println(""+word.charAt(num-1)+word.charAt(num));


                } else {
                    //if (word.length() == 2) {
                    System.out.print(word);
                    System.out.print(word);
                }
            }
        }

        }
    }
