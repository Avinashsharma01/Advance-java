package Inheritance;

// this is the parent class which will be inherited by the child classes
// inheritance , interface, abstract class, polymorphism, encapsulation, abstraction
public class Animal {
    int legs= 4;
    String name = "Animal";
    Boolean Emotion = true;


    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
    public void makeSound(){
        System.out.println("Animal is making sound");
    }

}
