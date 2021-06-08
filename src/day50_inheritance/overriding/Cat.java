package day50_inheritance.overriding;

import day50_inheritance.overriding.Animal;

public class Cat extends Animal {
    public void jumping(){
        System.out.println("Cat is jumping");
    }
    @Override
    public void speak(){
        System.out.println("Cat is saying meow");

    }

}
