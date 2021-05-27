package day35_methods_with_param;

import java.util.Scanner;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(8);
        Scanner sre = new Scanner(System.in);
        int count =sre.nextInt();
        displayValue(count);
        String name1 =sre.next();
        greetByName(name1);
    }
    public static void displayValue(int num){
        System.out.println("value is " + num);
    }
    public static void greetByName(String name){
        System.out.println("hello "+ name + " how are you today");
    }
}
