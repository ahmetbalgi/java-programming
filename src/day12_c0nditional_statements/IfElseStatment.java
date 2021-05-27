package day12_c0nditional_statements;

public class IfElseStatment {
    public static void main(String[] args) {


        if (10 > 5){
            System.out.println("Condition is true ");
        }else {
            System.out.println("Condition is false");
        }
        int count = 25;
        if ( count > 30){
            System.out.println("Count more than 30 ");

        }else {
            System.out.println("Count less than 30");
        }

        System.out.println("---------------------");

        int age = 25;
        if(age >= 18){
            System.out.println("You are eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else {
            System.out.println("You are not eligible to vote");
            System.out.println("Age is less than 18");
        }

    }
}
