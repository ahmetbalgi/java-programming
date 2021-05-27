package day24_loops;
import java.util.*;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int dollars ;
        System.out.println("give me 5 dollar");
            dollars=scan.nextInt();

          while (dollars!=5){
              dollars=scan.nextInt();

          }
        System.out.println("thank you");
    }
}
