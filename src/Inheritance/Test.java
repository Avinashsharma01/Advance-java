package Inheritance;

// this is the main class where we will test the inheritance

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();

        dog.eat();
        dog.sleep();
        dog.walk();
        dog.makeSound();
        dog.bark();
        dog.wagTail();
        dog.fetch();

        cat.eat();
        cat.sleep();
        cat.walk();
        cat.makeSound();
        cat.meow();
        cat.purr();
        cat.scratch();


        animal.eat();
        animal.sleep();
        animal.walk();
        animal.makeSound();
        System.out.println(animal.legs);
        System.out.println(animal.name);
        System.out.println(animal.Emotion);


    }
}
