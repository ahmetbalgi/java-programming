package replet;

public class PrimeNumber {
    public static void main(String[] args) {
        int prime = 50;
        int count = 0;
        for (int i = 1; i <= prime; i++) {
            count=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(i);
            }

        }
    }
}
