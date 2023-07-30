package concepts;

/**
 *  Can you show the concept of abstract methods
 */
abstract class Animal{
    public abstract void makeSound();

}

class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog says Woof!");
    }
}

class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Cat says Meow!");
    }
}
public class abstractMethodExample {

    public static void main(String [] args){
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}
