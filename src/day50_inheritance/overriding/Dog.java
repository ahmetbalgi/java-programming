package day50_inheritance.overriding;

import day50_inheritance.overriding.Animal;

public class Dog extends Animal {
    public void run(){
        System.out.println("Dog is running");
    }
    public void speak(){
        System.out.println("Dog is barking ruff woof");
    }


}
