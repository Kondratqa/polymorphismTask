package polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Barsik", "Black", 3, 5);
        Animal dog = new Dog("Pit", "Grey", 5, 15);
        Tigr tigr = new Tigr("Sherhan", "Yelow", 5, 30);

        dog.makeSound();
        cat.makeSound();
        tigr.makeSound();
    }
}