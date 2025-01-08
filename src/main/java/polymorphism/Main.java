package polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Barsik", "Black", 3, 5);
        Animal tigr = new Tigr("Sherhan", "Yelow", 5, 30);
        Animal dog = new Dog("Pit", "Grey", 5, 15);
        Horse horse = new Horse("Mike", "Black", 5, 15);

        polymorphism(cat);
        polymorphism(tigr);
        polymorphism(dog);
        polymorphismHorse(horse);

    }
    public static void polymorphism (Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).securityDog();
            ((Dog) animal).theDogServes();
        }
        animal.makeSound();
    }
    public static void polymorphismHorse (Animal animal) {
        if (animal instanceof Horse) {
            ((Horse) animal).CarryTheRider();
        }
        animal.makeSound();
    }
}
