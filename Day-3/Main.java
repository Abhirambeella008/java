class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal a;        // Reference of parent class

        a = new Dog();   // Dog object
        a.sound();       // Calls Dog's sound()

        a = new Cat();   // Cat object
        a.sound();       // Calls Cat's sound()
    }
} 
