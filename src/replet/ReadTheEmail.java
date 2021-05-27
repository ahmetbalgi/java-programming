package replet;
import java.util.*;
public class ReadTheEmail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.contains("alejandro")){
            System.out.println("read");
        }else {
            System.out.println("don't read");
        }
    }
}
