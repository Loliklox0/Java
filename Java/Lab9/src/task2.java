class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {

    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

public class task2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweet");

        dog.sound();
        cat.sound();
        bird.sound();
    }
}