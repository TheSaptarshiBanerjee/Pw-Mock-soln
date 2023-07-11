/* Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. 
Implement subclasses Dog, Cat, and Cow that inherit from the Animal class. 
Implement the makeSound() method in each subclass to print the sound made by a dog, cat, and cow, respectively. */


// Superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// Subclass Cow
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow mooes");
    }
}

// Main class to test the Animal subclasses
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        
        dog.makeSound();    
        cat.makeSound();    
        cow.makeSound();    
    }
}
