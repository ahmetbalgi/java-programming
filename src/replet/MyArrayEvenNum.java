package replet;

import java.util.Scanner;

public class MyArrayEvenNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] nums={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
      int counter = 0;
      for (int i:nums){
          if (i%2==0){
              counter++;
          }
      }
        System.out.println("Evens: "+ counter);
    }
}
