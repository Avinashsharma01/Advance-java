package Inheritance;




public class Dog extends Animal {

    String name = "Dog";
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void wagTail(){
        System.out.println("Dog is wagging tail");
    }
    public void fetch(){
        System.out.println("Dog is fetching");
    }


    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void walk(){
        System.out.println("Dog is walking");
    }
    public void makeSound(){
        System.out.println("Dog is making sound");
    }

}
