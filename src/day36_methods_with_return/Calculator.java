package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(9,8));
        System.out.println(divide(6,3));
    }
    public static double add(double num,double num1){
        double sum = num+num1;
        return sum;
    }
    public static double minus(double num,double num1) {
        double sum = num - num1;
        return sum;
    }
    public static double multibly(double num,double num1) {
        double sum = num * num1;
        return sum;
    }
    public static double divide(double num,double num1) {
        double sum = num / num1;
        return sum;
    }

}
