package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(7);
        String word ="wooden spoon";
        count(word.length());
        printAge(1981);
    }
    public static void count(int num){
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
    public static void printAge(int year){
        int age =2021-year;
        System.out.println("Birth year: "+year+" age "+ age);
    }
}
