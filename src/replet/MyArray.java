package replet;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] word={scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()};
        for(String s:word){

            System.out.println(s.charAt(0)+""+s.charAt(s.length()-1));



        }
    }
}
