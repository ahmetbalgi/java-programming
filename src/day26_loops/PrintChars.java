package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i <= word.length() - 1; i++) {
            System.out.println(word.charAt(i));
        }
        String word1 = "java";
        for (int i =word1.length()-1;i >= 0;i--){
            System.out.print(word.charAt(i));

        }
    }
}
