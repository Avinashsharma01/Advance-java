package Inheritance;

public class Cat extends Animal {

    String name = "Cat";

    public void meow(){
        System.out.println("Cat is meowing");
    }
    public void purr(){
        System.out.println("Cat is purring");
    }
    public void scratch(){
        System.out.println("Cat is scratching");
    }


    @Override
    public void eat(){
        System.out.println("Cat is eating");

    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }
    public void walk(){
        System.out.println("Cat is walking");
    }
    public void makeSound(){
        System.out.println("Cat is making sound");
    }

}
