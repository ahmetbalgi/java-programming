package day25_loops;

import java.util.Scanner;

public class StratEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end number");
        int start =scan.nextInt();
        int end = scan.nextInt();
        if (start>end){
            System.out.println("reverse number is not supported");
        }
        for (int i = start; i<= end; i++){
            System.out.print(i+ " ");
        }
    }
}
