package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");

            }
        }
        System.out.println("\nodd number 0 - 100");

        for (int n = 0; n <= 100; n++) {
            if (n % 2 == 1) {
                System.out.print(n + " ");
            }
        }
    }
}
