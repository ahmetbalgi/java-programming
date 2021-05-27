package day26_loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  num = scan.nextInt();
       if(num<1|| num>11){
           System.out.println("ERROR: INVALID INPUT");
           return;
       }

        for (int i=0;i <=10;i++){

            int number=i;
            System.out.println(num+" x "+number+" = "+number*num);

        }
    }
}
