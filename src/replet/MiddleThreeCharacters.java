package replet;
import java.util.*;
public class MiddleThreeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length()>5 && word.length()%2==1){
            System.out.println(word.substring(word.length()/3,word.length()/3+3));

        }else {
            System.out.println("invalid");
        }
    }
}
