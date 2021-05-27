package day26_loops;
import java.util.*;
public class mirjNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        if(word1.length()==3&&word2.length()==3){
           char word3=word1.charAt(word1.length());
           char word4 = word2.charAt(word2.length());
            System.out.println(""+word3+word4);
        }




}

}
