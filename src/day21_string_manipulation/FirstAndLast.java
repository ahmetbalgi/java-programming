package day21_string_manipulation;

public class FirstAndLast {
    public static void main(String[] args) {
        String word1 = "MOM";
        char first = word1.charAt(0);
        char last = word1.charAt(word1.length() - 1);
        System.out.println(last);
        if (first == last) {
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters mismatch");

        }
        String friend = "aziza";
        char firstLatter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println(firstLatter);
        System.out.println(lastLetter);

    }
}
