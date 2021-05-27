package day13_conditional_stattements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry ;
        if(isHungry = true){
            System.out.println("I am hungry I Will go get something to eat");
            System.out.println("thank code java");

        }else {
            System.out.println("I am not hungry, I will keep coding java" );
        }
        double price = 130.44;
        double isAffordable = 200;
        if(isAffordable >= price){
            System.out.println("I can afford it, lets buy!");


        }else {
            System.out.println("Too expensive, lets keep coding java");
        }
        boolean isRemoteJob = true;
        if (isRemoteJob!=true){
            System.out.println("sorry i am not interested");

        }else {
            System.out.println("sure, I am interested, what is interview process?");
        }


    }
}
