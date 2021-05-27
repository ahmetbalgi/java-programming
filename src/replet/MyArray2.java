package replet;

import java.util.Scanner;

public class MyArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] nums={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
        boolean check =false;
      for (int i=0; i<nums.length-1;i++){
          int first=nums[i];
          int second =nums[i+1];
          if (first==5&&second==5){
              check=true;
              break;
          }
      }
        System.out.println(check);
    }
}
